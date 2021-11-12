package com.fz.controllers;

import com.fz.dao.StudentDao;

import com.fz.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        System.out.println("test进来了");

        return "ok";

    }

//    查询所有
    @ResponseBody
    @RequestMapping("getStudentAll")
    public List<Student> getStudentAll(){
        System.out.println("查询所有");
        List<Student> list = studentDao.getStudentAll();
        return list;

    }

}
