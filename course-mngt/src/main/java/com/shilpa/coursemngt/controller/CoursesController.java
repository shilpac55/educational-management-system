package com.shilpa.coursemngt.controller;

import com.shilpa.coursemngt.entity.Courses;
import com.shilpa.coursemngt.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @GetMapping
    public List<Courses> fetchAllCourses(Courses courses){
        return coursesService.fetchAllCourses();
    }

    @GetMapping("/{id}")
    public Courses findCourseById(@PathVariable( value = "id") long courseId){
        return coursesService.findCourseById(courseId);
    }

    @PostMapping
    public Courses insertCourse(@RequestBody Courses courses){
        return coursesService.insertCourse(courses);
    }

    @PutMapping("/{id}")
    public Courses updateCourse(@RequestBody Courses courses, @PathVariable (value = "id") long courseId){
        return coursesService.updateCourse(courseId, courses);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable ( value = "id") long courseId){
        coursesService.deleteCourse(courseId);
    }
}
