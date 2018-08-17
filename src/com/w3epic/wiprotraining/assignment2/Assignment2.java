/*
 * Create a class called compartment which represents the ship compartments for 
 * watertight subdivision its height, width and breadth. 
 * Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
 * To avoid conflict create this class in a new package called com.wipro.automobile.ship 
 * */

package com.w3epic.wiprotraining.assignment2;

public class Assignment2 {

	public static void main(String[] args) {
		Compartment compartment = new Compartment(10.5, 4.5, 8.2);
		
		System.out.println(compartment);
	}

}
