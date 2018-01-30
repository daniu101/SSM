package com.qingyu.dao;

import com.qingyu.model.SysInfo;

public interface SysInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysInfo record);

    int insertSelective(SysInfo record);

    SysInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysInfo record);

    int updateByPrimaryKey(SysInfo record);
}