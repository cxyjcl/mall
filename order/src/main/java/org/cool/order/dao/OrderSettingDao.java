package org.cool.order.dao;

import org.cool.order.pojo.OrderSetting;

public interface OrderSettingDao {

    int deleteById(Long id);

    int insert(OrderSetting row);

    OrderSetting selectById(Long id);

}