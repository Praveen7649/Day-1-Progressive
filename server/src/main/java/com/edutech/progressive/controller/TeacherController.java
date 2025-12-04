package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Teacher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    public ResponseEntity<List<Teacher>> getAllTeachers() {
        return null;
    }

    public ResponseEntity<Teacher> getTeacherById(int teacherId) {
        return null;
    }

    public ResponseEntity<Integer> addTeacher(Teacher teacher) {
        return null;
    }

    public ResponseEntity<Void> updateTeacher(int teacherId, Teacher teacher) {
        return null;
    }

    public ResponseEntity<Void> deleteTeacher(int teacherId) {
        return null;
    }

    public ResponseEntity<List<Teacher>> getTeacherSortedByYearsOfExperience() {
        return null;
    }
}
