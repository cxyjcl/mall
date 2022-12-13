package org.cool.ware.dao;

import org.cool.ware.pojo.WareOrderTask;

public interface WareOrderTaskDao {

    int deleteById(Long id);

    int insert(WareOrderTask row);

    WareOrderTask selectById(Long id);

    int updateById(WareOrderTask row);
}