package org.cool.order.dao;

import org.cool.order.pojo.RefundInfo;

public interface RefundInfoDao {

    int deleteById(Long id);

    int insert(RefundInfo row);

    RefundInfo selectById(Long id);

}