package oop.abstraction;

public class TestDrive {

	public static void main(String[] args) {
		
		ToyotaCar toyotaCar = new ToyotaCar();
		toyotaCar.wheel();
		
		SemiCar semiCar = new ToyotaCar();
		semiCar.electricVehicle();
		
		Car car = new ToyotaCar();
		car.wheel();
		
		Vehicle vehicle = new ToyotaCar();
		vehicle.motorCar();
	}

}
