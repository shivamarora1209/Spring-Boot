package com.example.CartMicroservice.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CartMicroservice.Dto.CartResponse;
import com.example.CartMicroservice.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

	Optional<Cart> findByUserId(Long userId);

}