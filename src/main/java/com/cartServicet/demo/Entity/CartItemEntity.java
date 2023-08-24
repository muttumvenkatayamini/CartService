package com.cartServicet.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartItemId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cart_id")
	private CartEntity cart;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_id")
	private ProductEntity products;
	

	private int quantity;

	private double price;

}
