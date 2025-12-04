package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Course;
import com.edutech.progressive.repository.CourseRepository;
import com.edutech.progressive.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplJpa implements CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImplJpa(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() throws Exception {
        return List.of();
    }

    @Override
    public Course getCourseById(int courseId) throws Exception {
        return null;
    }

    @Override
    public Integer addCourse(Course course) throws Exception {
        return -1;
    }

    @Override
    public void updateCourse(Course course) throws Exception {

    }

    @Override
    public void deleteCourse(int courseId) throws Exception {

    }

    @Override
    public List<Course> getAllCourseByTeacherId(int teacherId) {
        return null;
    }
}