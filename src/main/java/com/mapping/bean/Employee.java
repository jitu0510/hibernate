package com.mapping.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee implements Serializable{
	@Id
	private int eId;
	private String eName;
	private String designation;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
	private Laptop laptop;
	
}
