package org.cool.ware.dao;

import org.cool.ware.pojo.Purchase;

public interface PurchaseDao {

    int deleteById(Long id);

    int insert(Purchase row);

    Purchase selectById(Long id);

}