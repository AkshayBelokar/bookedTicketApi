package com.travelbookingsystem.travelbookingsystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.travelbooking.travelbookingsystem.entities.Costumer;

@Service
public class CostumerServiceimpl implements CostumerService{
	
	List<Costumer> list;
	
	public CostumerServiceimpl() {
		
		list=new ArrayList<>();
		list.add(new Costumer(420, 12, 1234, 2));
		list.add(new Costumer(820, 13, 1233, 4));
		
	}
	
	
	@Override
	public List<Costumer> getCostumers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Costumer getCostumer(long costumerId) {

		Costumer c=null;
		for(Costumer costumer:list) {
			if(costumer.getUser_id()==costumerId) {
				c=costumer;
				break;
			}
		}
		return c;
	}

	@Override
	public Costumer addCostumer(Costumer costumer) {
		list.add(costumer);		
		return costumer;
	}

}
