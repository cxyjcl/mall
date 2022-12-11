package org.cool.product.pojo;

import lombok.Data;

@Data
public class Category {
    private Long catId;

    private String name;

    private Long parentCid;

    private Integer catLevel;

    private Byte showStatus;

    private Integer sort;

    private String icon;

    private String productUnit;

    private Integer productCount;

}