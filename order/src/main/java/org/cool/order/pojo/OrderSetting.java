package org.cool.order.pojo;

import lombok.Data;

@Data
public class OrderSetting {
    private Long id;

    private Integer flashOrderOvertime;

    private Integer normalOrderOvertime;

    private Integer confirmOvertime;

    private Integer finishOvertime;

}