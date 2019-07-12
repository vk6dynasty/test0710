package com.qf.service.impl;

import com.qf.bean.Classes;
import com.qf.dao.ClassesMapper;
import com.qf.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService{

    @Resource
    private ClassesMapper classesMapper;
    @Override
    public List<Classes> findclasses() {
        return classesMapper.findclasses();
    }
}
