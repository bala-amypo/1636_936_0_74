package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu) {
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
    public StudentEntity getValue(@PathVariable Long id){
    return ser.getData(id);
}

}
