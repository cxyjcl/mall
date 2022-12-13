package org.cool.coupon.service.impl;

import org.cool.coupon.dao.CouponDao;
import org.cool.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    CouponDao couponDao;

    @Override
    public void getProduct(Long id) {
        couponDao.selectById(id);
    }
}
