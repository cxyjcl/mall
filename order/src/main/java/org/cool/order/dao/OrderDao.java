package org.cool.order.dao;

import org.cool.order.pojo.Order;

public interface OrderDao {

    int deleteById(Long id);

    int insert(Order row);

    Order selectById(Long id);

}