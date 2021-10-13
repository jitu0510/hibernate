package com.manymapping.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Cart implements Serializable {
	@Id
	private int cartId;
	private String cartName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
	private List<Products> products;


	

}
