package com.xebia.assignment.robotprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RobotPrototypeApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(RobotPrototypeApplication.class, args);
		Robot robot  = appContext.getBean(Robot.class);
		robot.walkAnCarryWeight(2, 5);
	}
}
