package org.cool.coupon.dao;

import org.cool.coupon.pojo.SeckillSkuNotice;

public interface SeckillSkuNoticeDao {
    int deleteById(Long id);

    int insert(SeckillSkuNotice row);

    SeckillSkuNotice selectById(Long id);

}