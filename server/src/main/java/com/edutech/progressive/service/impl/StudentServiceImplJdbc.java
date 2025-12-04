package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

import java.util.List;

public class StudentServiceImplJdbc implements StudentService {

    private StudentDAO studentDAO;

    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    
    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Integer addStudent(Student student) {
        return -1;
    }

    @Override
    public List<Student> getAllStudentSortedByName() {
        return List.of();
    }

    @Override
    public void updateStudent(Student student) {
    }

    @Override
    public void deleteStudent(int studentId) {
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }
}