package com.crio.learningnavigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crio.learningnavigator.model.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long>{
    
}
