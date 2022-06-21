package com.shilpa.coursemngt.service;

import com.shilpa.coursemngt.ResourceNotFoundException;
import com.shilpa.coursemngt.entity.Courses;
import com.shilpa.coursemngt.repo.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> fetchAllCourses(){
        return coursesRepository.findAll();
    }


    public Courses findCourseById(long courseId) {
        return coursesRepository.findById(courseId)
                .orElseThrow(()-> new ResourceNotFoundException("Course not found with id" + courseId));
    }

    public Courses insertCourse(Courses courses) {
        return coursesRepository.save(courses);
    }

    public Courses updateCourse(long courseId, Courses courses) {
        Courses existing= coursesRepository.findById(courseId)
                .orElseThrow(()-> new ResourceNotFoundException("Course not found with id" + courseId));
        existing.setCourseName(courses.getCourseName());
        existing.setSubject1(courses.getSubject1());
        existing.setSubject2(courses.getSubject2());
        existing.setSubject3(courses.getSubject3());
        existing.setSubject4(courses.getSubject4());
        existing.setSubject5(courses.getSubject5());
        existing.setSubject6(courses.getSubject6());

        return coursesRepository.save(existing);

    }


    public void deleteCourse(long courseId) {
        if(courseId>0)
        coursesRepository.deleteById(courseId);
    }
}
