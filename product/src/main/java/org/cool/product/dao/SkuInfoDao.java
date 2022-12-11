package org.cool.product.dao;

import org.cool.product.pojo.SkuInfo;

public interface SkuInfoDao {
    int deleteById(Long skuId);

    int insert(SkuInfo row);

    SkuInfo selectById(Long skuId);

}