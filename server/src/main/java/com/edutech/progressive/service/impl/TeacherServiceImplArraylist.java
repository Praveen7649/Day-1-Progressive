package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

import java.util.List;

public class TeacherServiceImplArraylist implements TeacherService {

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
    public void emptyArrayList() {
    }
}