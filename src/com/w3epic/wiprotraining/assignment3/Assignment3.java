/*
Create a package called com.automobile. Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 

Create TwoWheeler subpackage under Automobile package
Hero  class extends  Automobile.vehicle class 
public int getSpeed() 
– Returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device 
Honda class extends com.automobile.vehicle class
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.
Create a test class to test the methods available in all these child class.
 * */

package com.w3epic.wiprotraining.assignment3;

import com.automobile.Honda;
import com.automobile.twowheeler.Hero;

public class Assignment3 {

	public static void main(String[] args) {
		Hero hero = new Hero("Glamour 125", "WB16G1234", "Bob Biswas", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "WB18G7777", "Prodosh Mitra", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

	}

}
