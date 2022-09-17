package com.Data.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Data.Models.Inventory;
import com.Data.repository.InventoryRepository;

@Service
public class InventoryServiceImp implements InventoryService {

	@Autowired
	private InventoryRepository repo;

	@Override
	public List<Inventory> GetInventory() {
	
	
		return repo.findAll();
	}

	@Override
	public void saveInventory(Inventory inventory) {
		System.out.println("Saving inventory");
		this.repo.save(inventory);
	}

	@Override
	public Inventory getInventoryById(long id) {
		Optional<Inventory> optional = repo.findById(id);
		Inventory inventory = null;
		if (optional.isPresent()) {
			inventory = optional.get();
		} else {
			throw new RuntimeException("Employee not found for id ::" + id);
		}
		return inventory;

	}

	@Override
	public void deleteInventoryById(long id) {
System.out.println("Deleting  Inventory ");
		this.repo.deleteById(id);
	}

}
