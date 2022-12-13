package org.cool.ware.dao;

import org.cool.ware.pojo.PurchaseDetail;

public interface PurchaseDetailDao {
    int deleteById(Long id);

    int insert(PurchaseDetail row);

    PurchaseDetail selectById(Long id);

}