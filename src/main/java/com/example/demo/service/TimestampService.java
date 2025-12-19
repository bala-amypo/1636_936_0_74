
package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.TimestampEntity;

public interface ValidationService{
    ValidationEntity postData(ValidationEntity stu); //method declaration
    // List<ValidationEntity> getAllData();
    // String deleteData (int id);
     ValidationEntity getData(Long id);
}