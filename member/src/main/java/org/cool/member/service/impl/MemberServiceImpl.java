package org.cool.member.service.impl;

import org.cool.member.dao.MemberDao;
import org.cool.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    @Override
    public void getProduct(Long id) {
        memberDao.selectById(id);
    }
}
