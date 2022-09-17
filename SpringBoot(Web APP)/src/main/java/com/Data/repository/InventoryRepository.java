package com.Data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Data.Models.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	
	
}
