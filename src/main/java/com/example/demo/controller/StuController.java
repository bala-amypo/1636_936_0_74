package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.StuEntity;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class StuController {
    @Autowired
    StuService ser;

    @PostMapping("/post")
    public StuEntity sendData(@RequestBody StuEntity stu) {
        return ser.postData(stu);
    }

    // @PostMapping("/get")
    // public List<StudentEntity> getVal() {
    //     return ser.getAllData();
    // }

    // @PostMapping("/delete/{id}")
    // public String deleteValue(@PathVariable int id) {
    //     return ser.deleteData(id);
    // }
    @GetMapping("/get{id}")
    public StuEntity getValue(@PathVariable int id){
    return ser.getData(id);
}

}
