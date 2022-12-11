package org.cool.product.dao;


import org.cool.product.pojo.SpuInfo;

public interface SpuInfoDao {
    int deleteById(Long id);

    int insert(SpuInfo row);

    SpuInfo selectById(Long id);

}