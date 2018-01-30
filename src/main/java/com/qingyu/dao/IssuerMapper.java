package com.qingyu.dao;

import com.qingyu.model.Issuer;

public interface IssuerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Issuer record);

    int insertSelective(Issuer record);

    Issuer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Issuer record);

    int updateByPrimaryKey(Issuer record);
}