package com.qf.dao;

import com.qf.bean.Knowledge;

import java.util.List;
import java.util.Map;

public interface KnowledgeMapper {
    //查询书籍列表，用map存储参数
    public List<Knowledge> findknow(Map map);
    int deleteByPrimaryKey(Integer id);

    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    Knowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);

    //4.主键查询
    public Knowledge findbyid(int kid);


}