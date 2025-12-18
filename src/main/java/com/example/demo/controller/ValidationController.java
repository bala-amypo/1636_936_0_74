package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
public class ValidationController {
    @Autowired
    ValidationService ser;

    @PostMapping("/post")
    public ValidationEntity sendData(@RequestBody ValidationEntity stu) {
        return ser.postData(stu);
    }

    // @PostMapping("/get")
    // public List<ValidationEntity> getVal() {
    //     return ser.getAllData();
    // }

    // @PostMapping("/delete/{id}")
    // public String deleteValue(@PathVariable int id) {
    //     return ser.deleteData(id);
    // }
}
