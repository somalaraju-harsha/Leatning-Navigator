package com.crio.learningnavigator.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name="name")
    private String studentName;

    @OneToMany
    @JoinColumn(name = "fk_student_id",referencedColumnName = "id")
    private Set<Subject> subjectList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id",referencedColumnName = "id")
    private Set<Exam> examList;
}
