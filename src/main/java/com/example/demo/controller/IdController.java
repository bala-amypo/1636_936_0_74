package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.entity.IdEntity;
import com.example.demo.service.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class IdController {
    @Autowired
    IdService ser;

    @PostMapping("/post")
    public IdEntity sendData(@RequestBody IdEntity stu) {
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
    public IdEntity getValue(@PathVariable int id){
    return ser.getData(id);
}

}
