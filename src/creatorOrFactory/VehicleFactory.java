package creatorOrFactory;

import product.Vehicle;

public class VehicleFactory {
	
	public Vehicle getVehicle(VehicleType vt) {
		return vt.createVihicle();
	}

}
