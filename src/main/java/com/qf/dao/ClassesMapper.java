package com.qf.dao;

import com.qf.bean.Classes;

import java.util.List;

public interface ClassesMapper {

    //获得所有的分类列表
    public List<Classes> findclasses();

    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}