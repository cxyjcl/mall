package org.cool.coupon.dao;

import org.cool.coupon.pojo.SeckillPromotion;

public interface SeckillPromotionDao {

    int deleteById(Long id);

    int insert(SeckillPromotion row);

    SeckillPromotion selectById(Long id);

}