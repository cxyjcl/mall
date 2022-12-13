package org.cool.ware.dao;

import org.cool.ware.pojo.WareSku;

public interface WareSkuDao {

    int deleteById(Long id);

    int insert(WareSku row);

    WareSku selectById(Long id);

}