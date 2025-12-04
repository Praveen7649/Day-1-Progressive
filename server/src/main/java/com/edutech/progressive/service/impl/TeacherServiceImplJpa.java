package com.edutech.progressive.service.impl;

import com.edutech.progressive.dto.TeacherDTO;
import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.repository.TeacherRepository;
import com.edutech.progressive.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return List.of();
    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        return -1;
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        return List.of();
    }

    @Override
    public void updateTeacher(Teacher teacher) throws Exception {

    }

    @Override
    public void deleteTeacher(int teacherId) throws Exception {

    }

    @Override
    public Teacher getTeacherById(int teacherId) throws Exception {
        return null;
    }

}