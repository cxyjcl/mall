package org.cool.product.service.impl;

import org.cool.product.dao.SpuInfoDao;
import org.cool.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    SpuInfoDao spuInfoDao;
    @Override
    public void getProduct(Long id) {
        spuInfoDao.selectById(id);
    }
}
