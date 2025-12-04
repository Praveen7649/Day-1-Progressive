package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.CourseDAO;
import com.edutech.progressive.entity.Course;
import com.edutech.progressive.service.CourseService;

import java.util.List;

public class CourseServiceImplJdbc implements CourseService {

    private CourseDAO courseDAO;

    public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }
    
    @Override
    public List<Course> getAllCourses() {
        return List.of();
    }

    @Override
    public Course getCourseById(int courseId) {
        return null;
    }

    @Override
    public Integer addCourse(Course course) {
        return -1;
    }

    @Override
    public void updateCourse(Course course) {

    }

    @Override
    public void deleteCourse(int courseId) {

    }
}