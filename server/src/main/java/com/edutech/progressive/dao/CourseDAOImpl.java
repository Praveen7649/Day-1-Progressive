package com.edutech.progressive.dao;

import com.edutech.progressive.entity.Course;

import java.util.List;

public class CourseDAOImpl implements CourseDAO{

    @Override
    public int addCourse(Course course) {
        return -1;
    }

    @Override
    public Course getCourseById(int courseId) {
        return null;
    }

    @Override
    public void updateCourse(Course course) {

    }

    @Override
    public void deleteCourse(int courseId) {

    }

    @Override
    public List<Course> getAllCourses() {
        return List.of();
    }
}
