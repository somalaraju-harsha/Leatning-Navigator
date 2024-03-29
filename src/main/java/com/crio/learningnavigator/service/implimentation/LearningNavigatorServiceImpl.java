package com.crio.learningnavigator.service.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.learningnavigator.model.Exam;
import com.crio.learningnavigator.model.Student;
import com.crio.learningnavigator.model.Subject;
import com.crio.learningnavigator.repository.ExamRepository;
import com.crio.learningnavigator.repository.StudentRepository;
import com.crio.learningnavigator.repository.SubjectRepository;
import com.crio.learningnavigator.service.LearningNavigatorService;

@Service
public class LearningNavigatorServiceImpl implements LearningNavigatorService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    
    
}
