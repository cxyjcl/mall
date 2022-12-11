package org.cool.product.pojo;

import lombok.Data;

@Data
public class SkuImages {
    private Long id;

    private Long skuId;

    private String imgUrl;

    private Integer imgSort;

    private Integer defaultImg;

}