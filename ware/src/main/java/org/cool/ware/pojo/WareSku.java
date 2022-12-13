package org.cool.ware.pojo;

import lombok.Data;

@Data
public class WareSku {
    private Long id;

    private Long skuId;

    private Long wareId;

    private Integer stock;

    private String skuName;

    private Integer stockLocked;

}