package com.cartServicet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author muttum.venkatayamini
 *
 */
import com.cartServicet.demo.Entity.CartEntity;




@Repository
public interface CartRepo extends JpaRepository<CartEntity, Long> {

//	void deleteAllById(Long cartId);
	    void deleteById(Long id);

		// List<ProductEntity> findAllProductEntityByCartEntity_cartId(Long cartId);
	    
	   


}
