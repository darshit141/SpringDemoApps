package com.Data.Controller;
import com.Data.Models.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Data.Service.InventoryService;
@Controller
public class InventoryController {

	@Autowired
	private InventoryService service;
	
	@GetMapping("/")
	public String viewHomePage( Model model)
	{
		
		System.out.println(service.GetInventory());
		model.addAttribute("Inventory",service.GetInventory());
		return "index";
		
	}
	


	@GetMapping("/ShowNewInventoryForm")
	public String InventoryForm(Model model)
	{
		Inventory inventory=new Inventory();
		model.addAttribute("Inventory",inventory);
		return "new_Inventory";
	}
	@PostMapping("/saveInventory")
	public String saveInventory(@ModelAttribute("Inventory") Inventory inventory)
	{
		service.saveInventory(inventory);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String ShowFormForUpdate(@PathVariable(value = "id")long id,Model model )
	{
		System.out.println("processing update button");
		//get Inventory from service
		Inventory inventory = service.getInventoryById(id);
		
		//setting Inventory as a model
		model.addAttribute("Inventory",inventory);
		return"updateInventory";
	}
	@GetMapping("/deleteInventory/{id}")
	public String DeleteInventory(@PathVariable(value ="id") long id) {
		
		 this.service.deleteInventoryById(id);
		return "redirect:/";
	}
	

}
