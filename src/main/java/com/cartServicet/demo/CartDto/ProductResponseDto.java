package com.cartServicet.demo.CartDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductResponseDto {

	private Long productId;

	private int quantity;

	private double price;
	

}
