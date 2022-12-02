package org.perscholas.models;

public class Vehicle {
	
	
	// fields
		
		// id for the vehicles
		private String vin; 
		
		private String brand;
		
		private String model; 
		
		private int year;
	// constructors 
	
		// no args constructor
		public Vehicle() {}

		public Vehicle(String vin, String brand, String model, int year) {
			this.vin = vin;
			this.brand = brand;
			this.model = model;
			this.year = year;
		}
		
		
	// methods 
	
		public void printVehicleInformation() {
			System.out.printf("Brand: %s Model: %s Year: %d %n", this.brand, this.model, this.year);
		}
		
		

		
		@Override
		public String toString() {
			return "Vehicle [vin=" + vin + ", brand=" + brand + ", model=" + model + ", year=" + year + "]";
		}
		
		
		
		
		// getters and setters 


		

		public String getVin() {
			return vin;
		}

		public void setVin(String vin) {
			this.vin = vin;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
	
		
		

}
