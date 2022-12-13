package org.cool.ware.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Purchase {
    private Long id;

    private Long assigneeId;

    private String assigneeName;

    private String phone;

    private Integer priority;

    private Integer state;

    private Long wareId;

    private BigDecimal amount;

    private Date createTime;

    private Date updateTime;

}