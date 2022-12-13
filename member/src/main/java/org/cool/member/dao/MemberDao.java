package org.cool.member.dao;

import org.cool.member.pojo.Member;

public interface MemberDao {

    int deleteById(Long id);

    int insert(Member row);

    Member selectById(Long id);

}