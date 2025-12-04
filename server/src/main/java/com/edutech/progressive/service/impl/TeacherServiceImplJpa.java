package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.repository.TeacherRepository;
import com.edutech.progressive.service.TeacherService;
import com.edutech.progressive.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Comparator;
import java.util.List;

@Service
public class TeacherServiceImplJpa implements TeacherService {

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImplJpa(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        return teacherRepository.findAll();
    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        return teacherRepository.save(teacher).getTeacherId();
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        List<Teacher> sortedTeachers = teacherRepository.findAll();
        sortedTeachers.sort(Comparator.comparing(Teacher::getYearsOfExperience));
        return sortedTeachers;
    }

    @Override
    public void updateTeacher(Teacher teacher) throws Exception {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(int teacherId) throws Exception {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public Teacher getTeacherById(int teacherId) throws Exception {
        return teacherRepository.findByTeacherId(teacherId);
    }
}