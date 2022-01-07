package com.travelbooking.travelbookingsystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelbooking.travelbookingsystem.entities.Costumer;
import com.travelbookingsystem.travelbookingsystem.services.CostumerService;

@RestController
public class MyController {
	
	@Autowired
	private CostumerService costumerService;
	
	
	
	//Costumer details
	@GetMapping("/costumers")
	public List<Costumer> getCostumers(){
		return this.costumerService.getCostumers();
	}
	
	@GetMapping("/costumers/{costumerId}")
	public Costumer getCostumer(@PathVariable String costumerId) {
		return this.costumerService.getCostumer(Long.parseLong(costumerId));
	}
	
	@PostMapping("/costumers")
	public Costumer addCostumer(@RequestBody Costumer costumer) {
		return this.costumerService.addCostumer(costumer);
		
	}
}
