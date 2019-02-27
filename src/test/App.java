package test;

import creatorOrFactory.VehicleFactory;
import creatorOrFactory.VehicleType;
import product.Vehicle;

public class App {

	public static void main(String[] args) {		
		VehicleFactory vFactory = new VehicleFactory();
		Vehicle vehicle = vFactory.getVehicle(VehicleType.BUS);
		
		System.out.println(vehicle.create());		
	}

}
