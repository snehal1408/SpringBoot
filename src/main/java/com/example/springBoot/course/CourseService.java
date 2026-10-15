package com.example.springBoot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    //Using JPA
        public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        //courseRepository.findAll().forEach(courses::add);
            //courseRepository.findByTopicId(topicId).forEach(courses::add);
            courseRepository.findByDescription(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String topicId) {

            return courseRepository.findById(topicId).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
            //Course.setId(id);
       courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
