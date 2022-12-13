package org.cool.ware.service.impl;

import org.cool.ware.dao.WareInfoDao;
import org.cool.ware.service.WareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WareInfoServiceImpl implements WareInfoService {

    @Autowired
    WareInfoDao wareInfoDao;

    @Override
    public void getProduct(Long id) {
        wareInfoDao.selectById(id);
    }
}
