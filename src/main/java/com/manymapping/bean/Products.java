package com.manymapping.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Products implements Serializable {
	@Id
	private int pId;
	private String pName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartId")
	private Cart cart;
}
