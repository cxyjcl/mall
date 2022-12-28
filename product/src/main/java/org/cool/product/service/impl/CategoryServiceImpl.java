package org.cool.product.service.impl;

import org.cool.product.dto.TreeCategoryDTO;
import org.cool.product.manager.CategoryManager;
import org.cool.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryManager categoryManager;

    @Override
    public List<TreeCategoryDTO> getTreeCategory() {
        return categoryManager.getTreeCategory();
    }
}
