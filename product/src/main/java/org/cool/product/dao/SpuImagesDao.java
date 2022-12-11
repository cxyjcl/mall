package org.cool.product.dao;

import org.cool.product.pojo.SpuImages;

public interface SpuImagesDao {

    int deleteById(Long id);

    int insert(SpuImages row);

    SpuImages selectById(Long id);

}