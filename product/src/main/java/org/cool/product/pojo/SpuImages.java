package org.cool.product.pojo;

import lombok.Data;

@Data
public class SpuImages {
    private Long id;

    private Long spuId;

    private String imgName;

    private String imgUrl;

    private Integer imgSort;

    private Byte defaultImg;

}