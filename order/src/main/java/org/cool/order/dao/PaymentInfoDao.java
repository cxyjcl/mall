package org.cool.order.dao;


import org.cool.order.pojo.PaymentInfo;

public interface PaymentInfoDao {

    int deleteById(Long id);

    int insert(PaymentInfo row);

    PaymentInfo selectById(Long id);

}