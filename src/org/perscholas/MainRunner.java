package org.perscholas;

import org.perscholas.models.Car;
import org.perscholas.models.Vehicle;

/*
 * 
 * @author Jafer Alhaboubi
 * 
 */

public class MainRunner {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("VIN1234","BMW","530i",2022);
		vehicle.printVehicleInformation();
		System.out.println("-----------");
		Car car = new Car("VIN4455","BMW","730i",2021, (byte)4,"black");
		car.printVehicleInformation();
		
		Vehicle v = new Car();
		
		
		
		

	}

}
