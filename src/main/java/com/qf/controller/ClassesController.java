package com.qf.controller;

import com.qf.bean.Classes;
import com.qf.service.impl.ClassesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ClassesController {

    @Resource
    private ClassesServiceImpl classesService;

    @RequestMapping("/getclasses")
    public String findclasses(ModelMap map){
        List<Classes> classes = classesService.findclasses();
        map.addAttribute("clazz",classes);
        return "add";

    }
}
