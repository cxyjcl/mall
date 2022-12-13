package org.cool.member.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class MemberLoginLog {
    private Long id;

    private Long memberId;

    private Date createTime;

    private String ip;

    private String city;

}