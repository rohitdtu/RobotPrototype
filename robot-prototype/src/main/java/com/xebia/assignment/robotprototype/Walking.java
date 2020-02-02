package com.xebia.assignment.robotprototype;

import org.springframework.stereotype.Component;

@Component
public class Walking implements Work {
	
	private final double batteryRequiredPerKm = 20; // 20% per km 
	
	@Override
	public boolean work(int currentBattery, double units) {
		// TODO Auto-generated method stub
		return walk(currentBattery, units);
	}
	
	public boolean walk(int currentBattery, double distance){
		
		int batteryRequired = (int) (batteryRequiredPerKm * distance);
		
		if(batteryRequired > currentBattery){
			return false;
		} else {
			return true;
		}

	}
}
