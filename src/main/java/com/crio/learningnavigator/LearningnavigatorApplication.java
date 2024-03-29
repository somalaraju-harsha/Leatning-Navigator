package com.crio.learningnavigator;

import java.util.*;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crio.learningnavigator.model.Exam;
import com.crio.learningnavigator.model.Student;
import com.crio.learningnavigator.model.Subject;
import com.crio.learningnavigator.repository.ExamRepository;
import com.crio.learningnavigator.repository.StudentRepository;
import com.crio.learningnavigator.repository.SubjectRepository;

@SpringBootApplication
public class LearningnavigatorApplication implements CommandLineRunner {

	@Autowired
	private SubjectRepository subjectRepository;
	@Autowired
	private ExamRepository examRepository;
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearningnavigatorApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {

		Student std=new Student();
		std.setStudentName("raju");
		Set<Exam> examSet=new HashSet<>();
		Set<Subject> subSet=new HashSet<>();
		// examSet.add(exm);
		// std.setExamList(examSet);
		// std.setSubjectList(subSet);

		Subject sub=new Subject();
		sub.setSubjectName("french");
		Set<Student> stdSet=new HashSet<>();
		stdSet.add(std);
		sub.setStudentsList(stdSet);


		Exam exm=new Exam();
		exm.setSubject(sub);
		exm.setStudentList(stdSet);


		examSet.add(exm);
		std.setExamList(examSet);

		subSet.add(sub);
		std.setSubjectList(subSet);

		this.subjectRepository.save(sub);
		this.examRepository.save(exm);
		this.studentRepository.save(std);


	}

}
