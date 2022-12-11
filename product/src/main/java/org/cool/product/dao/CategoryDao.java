package org.cool.product.dao;

import org.cool.product.pojo.Category;

public interface CategoryDao {

    int deleteById(Long catId);

    int insert(Category row);

    Category selectById(Long catId);

}