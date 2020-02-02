package com.xebia.assignment.robotprototype;

import org.springframework.stereotype.Component;

@Component
public class HandlingObjects implements Work {
	
	private final int weightLimit = 10;
	private final double batteryRequiredPerKg = 2;  // 2% per kg
	
	@Override
	public boolean work(int currentBattery, double units) {
		// TODO Auto-generated method stub
		return carryObjects(currentBattery, units);
	}
	
	public boolean carryObjects(int currentBattery, double weight){
		
		int batteryRequired = (int) (batteryRequiredPerKg * weight);
		
		if(weight > weightLimit){
			return false;
		} else if(batteryRequired > currentBattery) {
			return false;
		} else {
			return true;
		}
	}

}
