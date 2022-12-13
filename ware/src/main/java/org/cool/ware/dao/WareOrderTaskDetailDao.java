package org.cool.ware.dao;

import org.cool.ware.pojo.WareOrderTaskDetail;

public interface WareOrderTaskDetailDao {

    int deleteById(Long id);

    int insert(WareOrderTaskDetail row);

    WareOrderTaskDetail selectById(Long id);

}