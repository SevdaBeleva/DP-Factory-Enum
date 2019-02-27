package creatorOrFactory;

import product.Bus;
import product.Car;
import product.ElectricCar;
import product.Truck;
import product.Vehicle;

public enum VehicleType {

	CAR {
		@Override
		public Vehicle createVihicle() {
			return new Car();			
		}
	}, 	
	TRUCK {
		@Override
		public Vehicle createVihicle() {
			return new Truck();
		}		
	},	
	ELECTRIC {
		@Override
		public Vehicle createVihicle() {
			return new ElectricCar();			
		}		
	}, 
	BUS {
		@Override
		public Vehicle createVihicle() {
			return new Bus();			
		}		
	};
	
	public abstract Vehicle createVihicle();
}
