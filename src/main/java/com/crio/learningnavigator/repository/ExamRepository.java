package com.crio.learningnavigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crio.learningnavigator.model.Exam;
@Repository
public interface ExamRepository extends JpaRepository<Exam,Long>{
    
}
