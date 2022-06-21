package com.shilpa.coursemngt.studentmngt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name= "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_id")
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

	
	@Column(name="student_aadhar")
	public long studentAadhar;
	
	@Column(name="father_aadhar")
	public long fatherAadhar;

	//public Address studentAddress;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id", referencedColumnName = "address_id")
	public Address address;
	
}
