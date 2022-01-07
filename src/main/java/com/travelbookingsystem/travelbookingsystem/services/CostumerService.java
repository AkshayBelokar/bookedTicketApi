package com.travelbookingsystem.travelbookingsystem.services;

import java.util.List;

import com.travelbooking.travelbookingsystem.entities.Costumer;

public interface CostumerService {
	public List<Costumer> getCostumers();
	
	public Costumer getCostumer(long costumerId);

	public Costumer addCostumer(Costumer costumer);
}
