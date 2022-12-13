package org.cool.member.controller;

import org.cool.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/test")
    public void test(Long id){
        memberService.getProduct(id);
    }
}
