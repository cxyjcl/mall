package org.cool.product.mapper;

import org.cool.product.dto.TreeCategoryDTO;
import org.cool.product.pojo.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    TreeCategoryDTO toTreeCategoryDTO(Category category);
}
