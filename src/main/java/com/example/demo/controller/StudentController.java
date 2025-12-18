package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.Autowired;

import com.example.demo.entity.StudentEntity;
import com.example.demo.entity.StudentService;

@RestController
public class StudentController