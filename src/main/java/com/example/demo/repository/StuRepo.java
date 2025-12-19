package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StuEntity;

@Repository
public interface StuRepo extends JpaRepository<StuEntity,Integer>{

}