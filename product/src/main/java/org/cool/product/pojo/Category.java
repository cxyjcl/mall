package org.cool.product.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category implements Serializable {

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