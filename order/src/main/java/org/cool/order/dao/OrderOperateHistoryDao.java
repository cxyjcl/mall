package org.cool.order.dao;

import org.cool.order.pojo.OrderOperateHistory;

public interface OrderOperateHistoryDao {

    int deleteById(Long id);

    int insert(OrderOperateHistory row);

    OrderOperateHistory selectById(Long id);

}