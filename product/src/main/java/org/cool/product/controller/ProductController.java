package org.cool.product.controller;

import org.cool.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/test")
    public void test(Long id){
        productService.getProduct(id);
    }
}
