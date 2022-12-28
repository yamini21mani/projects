package com.te.ecommerce.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ShippingAddress {
	@Id
	private Integer id;
	@NotBlank
	private String address;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	private Integer zipcode;
	@NotBlank
	private String country;
	
//	@OneToOne(mappedBy = "shippingAddress")
//	private Customer customer;
//	@OneToOne(mappedBy = "shippingAddress")
//	private SalesOrder salesOrder;
}