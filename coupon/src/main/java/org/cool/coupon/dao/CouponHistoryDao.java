package org.cool.coupon.dao;

import org.cool.coupon.pojo.CouponHistory;

public interface CouponHistoryDao {

    int deleteById(Long id);

    int insert(CouponHistory row);

    CouponHistory selectById(Long id);

}