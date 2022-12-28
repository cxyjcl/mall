package org.cool.product.controller;

import org.cool.product.dto.TreeCategoryDTO;
import org.cool.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/treeCategory")
    public List<TreeCategoryDTO> getTreeCategory(){
        return categoryService.getTreeCategory();
    }
}
