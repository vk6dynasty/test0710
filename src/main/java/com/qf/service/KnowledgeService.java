package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.bean.Knowledge;

import java.util.List;
import java.util.Map;

public interface KnowledgeService {
    public PageInfo<Knowledge> findknow(String title, int index, int size);

    int insert(Knowledge knowledge);
    //4.主键查询
    public Knowledge findbyid(int kid);

    int updateByPrimaryKeySelective(Knowledge record);

    int deleteByPrimaryKey(Integer id);
}
