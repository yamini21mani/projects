package com.te.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ecommerce.entity.CartItem;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer>{

}
