package org.cool.coupon.dao;

import org.cool.coupon.pojo.SeckillFullReduction;

public interface SeckillFullReductionDao {

    int deleteById(Long id);

    int insert(SeckillFullReduction row);

    SeckillFullReduction selectById(Long id);

}