package org.cool.product.dao;

import org.cool.product.pojo.SpuComment;

public interface SpuCommentDao {

    int deleteById(Long id);

    int insert(SpuComment row);

    SpuComment selectById(Long id);

}