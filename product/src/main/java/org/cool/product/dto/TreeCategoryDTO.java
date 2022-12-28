package org.cool.product.dto;

import lombok.Data;
import org.cool.product.pojo.Category;

import java.io.Serializable;
import java.util.List;

@Data
public class TreeCategoryDTO extends Category implements Serializable {

    List<Category> subCategory;
}
