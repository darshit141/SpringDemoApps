package com.Data.Service;

import java.util.List;

import com.Data.Models.Inventory;

public interface InventoryService {
	
		 void saveInventory(Inventory inventory);
		 Inventory getInventoryById(long id);
		 void deleteInventoryById(long id);
		List<Inventory> GetInventory();
}
