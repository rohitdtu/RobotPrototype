package com.xebia.assignment.robotprototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id;
	private String name;
	
	@Autowired 
	private Battery battery;
	
	@Autowired
	private Work handlingObjects;
	
	@Autowired
	private Work scanning;
	
	@Autowired
	private Work walking;
	
	public void walk(double distance){
		boolean canWalk = walking.work(battery.getCurrentBattery(), distance);
		
		if(!canWalk){
			System.out.println("Cant't walk");
		} else {
			battery.discharge(distance, 0);
			System.out.println(battery.getCurrentBattery());
		}
	}
	
	public void carryWeight(double weight){
		boolean canCarryWeight = handlingObjects.work(battery.getCurrentBattery(), weight);
		
		if(!canCarryWeight) {
			System.out.println("Overweight");
		} else {
			battery.discharge(0, weight);
			System.out.println(battery.getCurrentBattery());
		}
	}
	
	public void walkAndCarryWeight(double distance, double weight){
		boolean canWalk = walking.work(battery.getCurrentBattery(), distance);
		boolean canCarryWeight = handlingObjects.work(battery.getCurrentBattery(), weight);
		
		if(!canCarryWeight) {
			System.out.println("Overweight");
		} else if(!canWalk){
			System.out.println("Can't walk");
		} else {
			battery.discharge(distance, weight);
			System.out.println(battery.getCurrentBattery());
		}
	}


	public void Scan(){
		
	}
	
}
