package org.cool.member.dao;

import org.cool.member.pojo.IntegrationChangeHistory;

public interface IntegrationChangeHistoryDao {

    int deleteById(Long id);

    int insert(IntegrationChangeHistory row);

    IntegrationChangeHistory selectById(Long id);

}