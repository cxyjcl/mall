package org.cool.member.dao;

import org.cool.member.pojo.MemberLoginLog;

public interface MemberLoginLogDao {

    int deleteById(Long id);

    int insert(MemberLoginLog row);

    MemberLoginLog selectById(Long id);

}