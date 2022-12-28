package com.te.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Component
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@NotBlank
	private String firstName;
	@NotEmpty
	private String lastName;
	private long phoneno;
	@Email
	private String email;
//	private String otp;
	private String password;
//	private Integer cartId;

	@OneToOne(cascade = CascadeType.ALL)
	private Cart cart;
//	@OneToOne(cascade = CascadeType.ALL)
//	private SalesOrder salesOrder;
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToOne(cascade = CascadeType.ALL)
	private BillingAddress billingAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private ShippingAddress shippingAddress;

}
