package org.cool.order.controller;

import org.cool.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/test")
    public void test(Long id){
        orderService.getOrder(id);
    }
}
