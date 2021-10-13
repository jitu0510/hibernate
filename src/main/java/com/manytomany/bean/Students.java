package com.manytomany.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
public class Students implements Serializable{
	@Id
	private int StudentId;
	private String StudentName;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
	private List<Courses> courses;
	

}
