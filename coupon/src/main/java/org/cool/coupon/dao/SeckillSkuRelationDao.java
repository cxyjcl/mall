package org.cool.coupon.dao;

import org.cool.coupon.pojo.SeckillSkuRelation;

public interface SeckillSkuRelationDao {

    int deleteById(Long id);

    int insert(SeckillSkuRelation row);

    SeckillSkuRelation selectById(Long id);

}