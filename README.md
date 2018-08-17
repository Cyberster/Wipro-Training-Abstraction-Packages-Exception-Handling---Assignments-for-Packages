Wipro TalentNext PBL

Topics Covered

Hands-on Assignments for Packages



No. 	Hands-on Assignment 	Topics Covered 	Status

1 	

 Create a package called test package;
Define a class called foundation inside the test package; 
Inside the class, you need to define 4 integer variables; 
Var1 as private; 
Var2 as default; 
Var3 as protected; 
Var4 as public; 
Import this class and packages in another class. 
Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.

	Packages Access control Using package 	

2 	

 Create a class called compartment which represents the ship compartments for watertight subdivision its height, width and breadth. 
Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
To avoid conflict create this class in a new package called com.wipro.automobile.ship 

	Packages User defined packages 	

3 	

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

	Packages User defined packages 	

4 	

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

	Packages User defined packages 	