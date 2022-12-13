package org.cool.member.pojo;

import lombok.Data;

@Data
public class MemberReceiveAddress {
    private Long id;

    private Long memberId;

    private String name;

    private String phone;

    private String postCode;

    private String province;

    private String city;

    private String region;

    private String detailAddress;

    private String areaCode;

}