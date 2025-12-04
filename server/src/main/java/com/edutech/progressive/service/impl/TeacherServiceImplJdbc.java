package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

import java.util.List;

public class TeacherServiceImplJdbc implements TeacherService {

    private TeacherDAO teacherDAO;

    public TeacherServiceImplJdbc(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }
    
    @Override
    public List<Teacher> getAllTeachers() {
        return List.of();
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        return -1;
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() {
        return List.of();
    }

    @Override
    public void updateTeacher(Teacher teacher) {
    }

    @Override
    public void deleteTeacher(int teacherId) {
    }

    @Override
    public Teacher getTeacherById(int teacherId) {
        return null;
    }
}