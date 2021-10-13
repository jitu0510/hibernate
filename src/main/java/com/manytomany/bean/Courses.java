package com.manytomany.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
public class Courses implements Serializable {
	@Id
	private int courseId;
	private String CourseName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_courses",
	joinColumns = @JoinColumn(name ="studentId"),
	inverseJoinColumns = @JoinColumn(name="courseId"))
	private List<Students> students;
	

}
