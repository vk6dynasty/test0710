package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bean.Knowledge;
import com.qf.dao.KnowledgeMapper;
import com.qf.service.KnowledgeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KnowledgeServiceImpl implements KnowledgeService{

    @Resource
    private KnowledgeMapper knowledgeMapper;


    @Override
    public PageInfo<Knowledge> findknow(String title, int index, int size) {
        PageHelper.startPage(index,size);
        Map map = new HashMap();
        map.put("title",title);
        List<Knowledge> knowledgeList = knowledgeMapper.findknow(map);
        return new PageInfo<Knowledge>(knowledgeList);


    }

    @Override
    @Transactional
    public int insert(Knowledge knowledge) {
        return knowledgeMapper.insert(knowledge);
    }

    @Override
    public Knowledge findbyid(int kid) {
        return knowledgeMapper.findbyid(kid);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(Knowledge record) {
        return knowledgeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        return knowledgeMapper.deleteByPrimaryKey(id);
    }


}
