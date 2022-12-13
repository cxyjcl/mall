package org.cool.ware.pojo;

import lombok.Data;

@Data
public class WareOrderTaskDetail {
    private Long id;

    private Long skuId;

    private String skuName;

    private Integer skuNum;

    private Long taskId;

    private Long wareId;

    private Integer lockState;

}