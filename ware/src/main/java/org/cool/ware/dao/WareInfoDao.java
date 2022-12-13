package org.cool.ware.dao;

import org.cool.ware.pojo.WareInfo;

public interface WareInfoDao {

    int deleteById(Long id);

    int insert(WareInfo row);

    WareInfo selectById(Long id);

}