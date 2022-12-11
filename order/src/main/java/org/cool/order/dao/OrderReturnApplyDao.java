package org.cool.order.dao;

import org.cool.order.pojo.OrderReturnApply;

public interface OrderReturnApplyDao {

    int deleteById(Long id);

    int insert(OrderReturnApply row);

    OrderReturnApply selectById(Long id);

}