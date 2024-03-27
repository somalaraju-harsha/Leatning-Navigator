package com.crio.learningnavigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crio.learningnavigator.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
