package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.IdEntity;

@Repository
public interface IdRepo extends JpaRepository<IdEntity,Integer>{

}