package org.cool.member.dao;

import org.cool.member.pojo.MemberCollectSpu;

public interface MemberCollectSpuDao {

    int deleteById(Long id);

    int insert(MemberCollectSpu row);

    MemberCollectSpu selectById(Long id);

}