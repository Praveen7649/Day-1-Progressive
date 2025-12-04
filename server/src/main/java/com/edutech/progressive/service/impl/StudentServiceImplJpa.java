package com.edutech.progressive.service.impl;

import com.edutech.progressive.dto.StudentDTO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplJpa implements StudentService {

    @Override
    public List<Student> getAllStudents() throws Exception {
        return List.of();
    }

    @Override
    public Integer addStudent(Student student) throws Exception {
        return -1;
    }

    @Override
    public List<Student> getAllStudentSortedByName() throws Exception {
        return List.of();
    }

    @Override
    public void updateStudent(Student student) throws Exception {
    }

    @Override
    public void deleteStudent(int studentId) throws Exception {
    }

    @Override
    public Student getStudentById(int studentId) throws Exception {
        return null;
    }

    @Override
    public void modifyStudentDetails(StudentDTO studentDTO) {
    }
}