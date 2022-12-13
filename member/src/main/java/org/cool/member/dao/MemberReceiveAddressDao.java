package org.cool.member.dao;


import org.cool.member.pojo.MemberReceiveAddress;

public interface MemberReceiveAddressDao {

    int deleteById(Long id);

    int insert(MemberReceiveAddress row);

    MemberReceiveAddress selectById(Long id);

}