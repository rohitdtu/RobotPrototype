package com.xebia.assignment.robotprototype;

import org.springframework.stereotype.Component;

@Component
public class Battery implements PowerSupply {

	private int currentBattery = initialBattery;
	private final double dischargeRateForWalking = 20; // per km 
	private final double dischargeRateForWeight = 2;   // per kg
	
	@Override
	public int getCurrentBattery() {
		// TODO Auto-generated method stub
		return currentBattery;
	}

	@Override
	public void setCurrentBattery(int currentBattery) {
		// TODO Auto-generated method stub
		this.currentBattery = currentBattery;
	}

	@Override
	public void discharge(double distance, double weight) {
		// TODO Auto-generated method stub
		if(currentBattery < 0) {
			System.out.println("Not enough battery");
		} else if(currentBattery > 0 && currentBattery <= threshold){
			System.out.println("Low Battery");
		} else {
			int totalDischarge = (int) (dischargeRateForWalking * distance + dischargeRateForWeight * weight);
			currentBattery -= totalDischarge;
		}
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		currentBattery = 100;
	}

}
