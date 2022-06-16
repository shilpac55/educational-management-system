package com.shilpa.studentmngt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shilpa.studentmngt.ResourceNotFoundException;
import com.shilpa.studentmngt.entity.Student;
import com.shilpa.studentmngt.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public List<Student> fetchAllStudent() {
		return studentRepository.findAll();
	}

	public Object getStudentById(long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId)
				.orElseThrow(()-> new ResourceNotFoundException("Student not found with id" + studentId));
	}

	public Student insertStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public Student updateStudent(long studentId, Student student) {
		Student exsisting= studentRepository.findById(studentId)
				.orElseThrow(()-> new ResourceNotFoundException("Student not found with id" + studentId));
		exsisting.setStudentName(student.getStudentName());
		exsisting.setStudentDOB(student.getStudentDOB());
		
		return studentRepository.save(exsisting);
	}

	public void deleteStudent(long studentId) {
		
		if(studentId>0)
		studentRepository.deleteById(studentId);
		
	}

}
