package com.shilpa.coursemngt.studentmngt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shilpa.coursemngt.studentmngt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
