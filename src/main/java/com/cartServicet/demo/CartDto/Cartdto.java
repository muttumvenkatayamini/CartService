package com.cartServicet.demo.CartDto;
/**
 * 
 * @author muttum.venkatayamini
 *
 */
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Cartdto{
	
	private Long userId;
	private double totalPrice;
	private Long cartId;
	


}
