package com.shilpa.coursemngt.studentmngt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shilpa.coursemngt.studentmngt.entity.Student;
import com.shilpa.coursemngt.studentmngt.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/api/v1/student")
	public List<Student> fetchAllStudent(){
		return studentService.fetchAllStudent();
	}
	
	@GetMapping("/api/v1/student/{id}")
	public Student getStudentById(@PathVariable (value = "id" )long studentId) {
		return (Student) studentService.getStudentById(studentId);			
		
	}
	
	@PostMapping("/api/v1/student")
	public Student insertStudent(@RequestBody Student student) {
		return studentService.insertStudent(student);
	}
	

	@PutMapping("/api/v1/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable (value = "id" )long studentId) {
		return (Student) studentService.updateStudent(studentId, student);
			
	}
	
	@DeleteMapping("/api/v1/student/{id}")
	public void deleteStudent(@PathVariable (value = "id" ) long studentId) {
		studentService.deleteStudent(studentId);
	
	}

}
