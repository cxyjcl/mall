package org.cool.coupon.controller;

import org.cool.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {


    @Autowired
    CouponService couponService;

    @RequestMapping("/test")
    public void test(Long id){
        couponService.getProduct(id);
    }
}
