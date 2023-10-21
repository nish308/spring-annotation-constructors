package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	int id;
	String brand;
	String name;
	String color;
	
	public Car(@Value(value = "1")int id, @Value(value = "Hyundai")String brand, @Value(value = "i20")String name,
			@Value(value = "White")String color) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.color = color;
	}
	
	public void carDetails() {
		System.out.println(id);
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
	}
}
