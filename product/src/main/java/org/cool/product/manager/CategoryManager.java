package org.cool.product.manager;

import com.cool.common.utils.RedisKeyUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.cool.product.dao.CategoryDao;
import org.cool.product.dto.TreeCategoryDTO;
import org.cool.product.mapper.CategoryMapper;
import org.cool.product.pojo.Category;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CategoryManager {

    @Autowired
    private RedissonClient redissonClient;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryMapper categoryMapper;

    public List<TreeCategoryDTO> getTreeCategory() {
        List<TreeCategoryDTO> treeCategoryDTOS  = (List<TreeCategoryDTO>) redissonClient.getBucket(RedisKeyUtil.CATEGORY_TREE).get();
        if(CollectionUtils.isEmpty(treeCategoryDTOS)) {
            List<Category> categories = categoryDao.selectAll();
            treeCategoryDTOS = categories.stream().map(c -> {
                        TreeCategoryDTO treeCategoryDTO = categoryMapper.toTreeCategoryDTO(c);
                        List<Category> children = getChildren(categories, c.getParentCid());
                        treeCategoryDTO.setSubCategory(children);
                        return treeCategoryDTO;
                    })
                    .sorted(Comparator.comparing(Category::getSort))
                    .toList();
        }
        return treeCategoryDTOS;
    }

    private List<Category> getChildren(List<Category> categories, Long parentId) {
        return categories.stream()
                .filter(c -> Objects.equals(c.getParentCid(), parentId))
                .sorted(Comparator.comparing(Category::getSort))
                .collect(Collectors.toList());
    }
}
