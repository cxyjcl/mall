package org.cool.member.dao;

import org.cool.member.pojo.GrowthChangeHistory;

public interface GrowthChangeHistoryDao {
    int deleteById(Long id);

    int insert(GrowthChangeHistory row);

    GrowthChangeHistory selectById(Long id);

}