package org.cool.member.dao;

import org.cool.member.pojo.MemberLevel;

public interface MemberLevelDao {

    int deleteById(Long id);

    int insert(MemberLevel row);

    MemberLevel selectById(Long id);

}