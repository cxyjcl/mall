package org.cool.member.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class IntegrationChangeHistory {
    private Long id;

    private Long memberId;

    private Date createTime;

    private Integer changeValue;

    private String note;

    private Byte sourceType;

}