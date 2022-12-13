package org.cool.coupon.dao;

import org.cool.coupon.pojo.CouponSpuRelation;

public interface CouponSpuRelationDao {

    int deleteById(Long id);

    int insert(CouponSpuRelation row);

    CouponSpuRelation selectById(Long id);

}