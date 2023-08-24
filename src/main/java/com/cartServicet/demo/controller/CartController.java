package com.cartServicet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartServicet.demo.CartDto.CartDtoResponse;
import com.cartServicet.demo.CartDto.Cartdto;
import com.cartServicet.demo.CartDto.FetchCartDto;
import com.cartServicet.demo.CartDto.ProductDto;
import com.cartServicet.demo.CartDto.ProductResponseDto;
import com.cartServicet.demo.Entity.ProductEntity;
import com.cartServicet.demo.Service.CartService;



@RestController
@RequestMapping("/cart")


public class CartController {
	@Autowired
	private CartService cartService;
	
//  @PostMapping("/add")
//	public ResponseEntity<String> addToCart(@RequestBody Cartdto cartDto){
//		cartService.addToCart(cartDto);
//		return ResponseEntity.ok("product added to cart");
//	}
	
	@PostMapping("/create-cart")
	public ResponseEntity<CartDtoResponse> createcartRequest(@RequestBody Cartdto cartDto) {
		return ResponseEntity.ok(cartService.createCart(cartDto));
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<ProductResponseDto> createUserchat(@RequestBody ProductDto productDto) {
		return ResponseEntity.ok(cartService.addProductToCart(productDto));
	}
	
//	@DeleteMapping("/deleteCart")
//	public ResponseEntity<String> deleteFromCart(@RequestBody Long cartId){
//		cartService.deleteCart(cartId);
//		return ResponseEntity.ok("product deleted from cart ");
//	}
	
	@DeleteMapping("/{cartId}")

    public ResponseEntity<String> deleteCart(@PathVariable Long cartId) {

        try {

            cartService.deleteCart(cartId);

            return ResponseEntity.ok("Cart deleted successfully");

        } catch (RuntimeException e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cart not found");

        }

    }
	
	@PostMapping("/fetchproducts")
	public ResponseEntity<List<ProductEntity>> getallProductsByCartId(@RequestBody FetchCartDto fetchCartDto) {
		List<ProductEntity> requests = cartService.getAllProductsByCartId(fetchCartDto.getCartId());
		return new ResponseEntity<List<ProductEntity>>(requests, HttpStatus.OK);

	}
	

	


	

	

}
