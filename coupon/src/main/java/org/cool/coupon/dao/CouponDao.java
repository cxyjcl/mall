package org.cool.coupon.dao;

import org.cool.coupon.pojo.Coupon;

public interface CouponDao {

    int deleteById(Long id);

    int insert(Coupon row);

    Coupon selectById(Long id);

}