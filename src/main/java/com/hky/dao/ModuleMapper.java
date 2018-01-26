package com.hky.dao;

import com.hky.entity.Module;

public interface ModuleMapper {
    int deleteByPrimaryKey(String moId);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(String moId);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}