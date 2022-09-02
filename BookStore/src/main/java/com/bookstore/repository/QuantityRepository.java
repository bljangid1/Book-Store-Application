package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Quantity;
@Repository
public interface QuantityRepository extends JpaRepository<Quantity, Long>{

}