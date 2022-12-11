package org.cool.order.dao;

import org.cool.order.pojo.OrderItem;

public interface OrderItemDao {

    int deleteById(Long id);

    int insert(OrderItem row);

    OrderItem selectById(Long id);

}