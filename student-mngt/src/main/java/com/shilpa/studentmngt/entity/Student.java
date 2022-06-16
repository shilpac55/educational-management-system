package com.shilpa.studentmngt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long studentId;
	
	@Column(name="student_name")
	public String studentName;
	
	@Column(name="father_name")
	public String studentFatherName;
	
	@Column(name="mother_name")
	public String studentMotherName;
	
	@Column(name="student_dob")
	public Date studentDOB;
	
	@Column(name="student_gender")
	public String studentGender;
	
	@Column(name="student_email")
	public String studentEmail;
	//public Address studentAddress;
	//public Course course;
	
	@Column(name="student_aadhar")
	public long studentAadhar;
	
	@Column(name="father_aadhar")
	public long fathderAadhar;
	
	public Student() {};
	
	public Student(long studentId, String studentName, String studentFatherName, String studentMotherName,
			Date studentDOB, String studentGender, String studentEmail, long studentAadhar, long fathderAadhar) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
		this.studentDOB = studentDOB;
		this.studentGender = studentGender;
		this.studentEmail = studentEmail;
		this.studentAadhar = studentAadhar;
		this.fathderAadhar = fathderAadhar;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}
	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}
	public String getStudentMotherName() {
		return studentMotherName;
	}
	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public long getStudentAadhar() {
		return studentAadhar;
	}
	public void setStudentAadhar(long studentAadhar) {
		this.studentAadhar = studentAadhar;
	}
	public long getFathderAadhar() {
		return fathderAadhar;
	}
	public void setFathderAadhar(long fathderAadhar) {
		this.fathderAadhar = fathderAadhar;
	}
	
	
	
	
}
