package com.shilpa.coursemngt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id")
    public long courseId;

    @Column(name = "course_name")
    public String courseName;

    @Column(name = "subject_1")
    public String subject1;

    @Column(name = "subject_2")
    public String subject2;

    @Column(name = "subject_3")
    public String subject3;

    @Column(name = "subject_4")
    public String subject4;

    @Column(name = "subject_5")
    public String subject5;

    @Column(name = "subject_6")
    public String subject6;

}
