package com.mapping.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Laptop implements Serializable {
	@Id
	private int lId;
	private String lName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eId")
	private Employee employee; //using this ref_name in Employee.java as MappedBy 
	
	
}
