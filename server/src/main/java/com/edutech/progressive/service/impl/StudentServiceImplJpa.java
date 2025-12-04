package com.edutech.progressive.service.impl;

import com.edutech.progressive.dto.StudentDTO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.repository.StudentRepository;
import com.edutech.progressive.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class StudentServiceImplJpa implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplJpa(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        return studentRepository.findAll();
    }

    @Override
    public Integer addStudent(Student student) throws Exception {
        return studentRepository.save(student).getStudentId();
    }

    @Override
    public List<Student> getAllStudentSortedByName() throws Exception {
        List<Student> studentList = studentRepository.findAll();
        studentList.sort(Comparator.comparing(Student::getFullName));
        return studentList;
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentId) throws Exception {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student getStudentById(int studentId) throws Exception {
        return studentRepository.findByStudentId(studentId);
    }

    @Override
    public void modifyStudentDetails(StudentDTO studentDTO) {
    }
}