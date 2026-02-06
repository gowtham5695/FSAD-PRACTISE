package com.klu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainAPP {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Application.Xml");
		Car car=(Car)context.getBean("Car");
		car.drive();
		Bike bike=(Bike)context.getBean("bike");
		bike.ride();

	}

}
