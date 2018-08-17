/*
Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under Automobile package
Logan class extends com.automobile.vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 
Ford class extends  com.automobile.vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
 * */

package com.w3epic.wiprotraining.assignment4;

import com.automobile.Ford;
import com.automobile.Logan;

public class Assignment4 {

	public static void main(String[] args) {
		Logan logan = new Logan("Logan XYZ", "WB16F2222", "Bob Biswas", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.speed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Mustang GT", "WB16F4444", "Alice", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? " + ford.tempControl());
		
//		1649
//		18004194000

	}

}
