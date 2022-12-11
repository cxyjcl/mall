package org.cool.product.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SpuInfo {
    private Long id;

    private String spuName;

    private String spuDescription;

    private BigDecimal weight;

    private Byte publishStatus;

    private Date createTime;

    private Date updateTime;

}