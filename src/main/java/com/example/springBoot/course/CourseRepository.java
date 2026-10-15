package com.example.springBoot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {
    List<Course> findByTopicId(String topicId);
    List<Course> findByName(String name);
    List<Course> findByDescription(String description);
}
