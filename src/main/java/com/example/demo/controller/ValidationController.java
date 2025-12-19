package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

@RestController
public class ValidationController {

    @Autowired 
    ValidationService ser;

    @PostMapping("/post1")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
        return ser.postData(stu);
    }

    @GetMapping("/get1/{id}")
    public ValidationEntity getValue(@PathVariable Long id){
        return ser.getData(id);
    }
}
