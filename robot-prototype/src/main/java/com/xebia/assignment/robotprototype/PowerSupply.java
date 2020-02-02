package com.xebia.assignment.robotprototype;

public interface PowerSupply {
	int initialBattery = 100;
	int threshold = 15;
	int getCurrentBattery();
	void setCurrentBattery(int currentBattery);
	void discharge(double distance, double weight);
	void charge();
}
