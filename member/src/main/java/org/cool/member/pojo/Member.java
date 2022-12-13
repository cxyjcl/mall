package org.cool.member.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private Long id;

    private Long levelId;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String email;

    private String avatar;

    private Byte gender;

    private Date birth;

    private String city;

    private String job;

    private String sign;

    private Integer integration;

    private Integer growth;

    private Byte state;

    private Date createTime;

}