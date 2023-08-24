package com.cartServicet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartServicet.demo.Entity.CartItemEntity;

public interface CartItemRepo extends JpaRepository<CartItemEntity, Long> {

}
