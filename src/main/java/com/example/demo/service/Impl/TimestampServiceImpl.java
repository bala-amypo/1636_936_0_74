package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.service.TimestampService;
import com.example.demo.repository.TimestampRepo;
import com.example.demo.repository.Repo;
import com.example.demo.exception.Exception;
// import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService{
       @Autowired ValidationRepo student;
       @Override
  public ValidationEntity postData(ValidationEntity stu){
    return student.save(stu);
  }
//   @Override
//   public List<StudentEntity>getAllData(){
//     return student.findAll();
//   }
//   @Override
//   public String deleteData(int id){
//     student.deleteById(id);
//     return "User with "+id+" deleted successful";
//   }
@Override
public ValidationEntity getData(Long id){
  return student.findById(id).orElseThrow(()-> new ValidationException("Invalid Id"+id));
}
}