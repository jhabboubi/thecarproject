package org.perscholas.models;

public class Car extends Vehicle{
		// fields 
			public final static int TOPSPEED = 120;
			private byte numDoors;
			private String color;
		// constructors
			public Car() {} // no args constructor
			
			public Car(String vin, String brand, String model, int year, byte numDoors, String color) {
				super(vin,brand,model,year);
				this.numDoors = numDoors;
				this.color = color;
				
			}

			
			
			
			
		// methods
			@Override
			public void printVehicleInformation() {
				
				super.printVehicleInformation();
				System.out.printf("Number of Doors: %d Color: %s %n",this.numDoors,this.color);
			}
			
			public static void helloWorld() {
				System.out.println("Hello World");
				
			}
			
			
			
				

			
			
				
		// setters and getters
			
			public byte getNumDoors() {
				return numDoors;
			}

			

			public void setNumDoors(byte numDoors) {
				this.numDoors = numDoors;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}
			
}
