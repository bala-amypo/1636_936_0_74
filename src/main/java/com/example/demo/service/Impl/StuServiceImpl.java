package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StuEntity;
import com.example.demo.service.StuService;
import com.example.demo.repository.StuRepo;
// import com.example.demo.exception.Exception;
// import java.util.List;

@Service
public class StuServiceImpl implements  StuService{
       @Autowired  StuRepo student;
       @Override
  public  StuEntity postData( StuEntity stu){
    return student.save(stu);
  }
//   @Override
//   public List< TimestampEntity>getAllData(){
//     return student.findAll();
//   }
//   @Override
//   public String deleteData(int id){
//     student.deleteById(id);
//     return "User with "+id+" deleted successful";
//   }
// @Override
// public  Entity getData(Long id){
//   return student.findById(id).orElseThrow(()-> new  TimestampException("Invalid Id"+id));
// }
}