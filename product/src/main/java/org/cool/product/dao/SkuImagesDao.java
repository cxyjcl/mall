package org.cool.product.dao;

import org.cool.product.pojo.SkuImages;

public interface SkuImagesDao {
    int deleteById(Long id);

    int insert(SkuImages row);

    SkuImages selectById(Long id);

}