package com.shilpa.studentmngt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shilpa.studentmngt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
