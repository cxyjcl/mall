package org.cool.ware.controller;

import org.cool.ware.service.WareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WareInfoController {

    @Autowired
    WareInfoService wareInfoService;

    @RequestMapping("/test")
    public void test(Long id){
        wareInfoService.getProduct(id);
    }
}
