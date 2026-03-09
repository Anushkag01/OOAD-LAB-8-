package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class DbInfoController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/db-info")
    public String showDbInfo() {
        long totalStudents = studentService.getAllStudents().size();
        return "Total Students in Database: " + totalStudents;
    }
}
