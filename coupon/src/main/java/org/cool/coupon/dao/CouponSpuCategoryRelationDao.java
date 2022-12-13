package org.cool.coupon.dao;

import org.cool.coupon.pojo.CouponSpuCategoryRelation;

public interface CouponSpuCategoryRelationDao {
    int deleteById(Long id);

    int insert(CouponSpuCategoryRelation row);

    CouponSpuCategoryRelation selectById(Long id);

}