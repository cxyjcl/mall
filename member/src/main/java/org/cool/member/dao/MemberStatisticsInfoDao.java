package org.cool.member.dao;

import org.cool.member.pojo.MemberStatisticsInfo;

public interface MemberStatisticsInfoDao {

    int deleteById(Long id);

    int insert(MemberStatisticsInfo row);

    MemberStatisticsInfo selectById(Long id);

}