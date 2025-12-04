package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

import java.util.List;

public class StudentServiceImplArraylist implements StudentService {

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
    public void emptyArrayList() {
    }
}