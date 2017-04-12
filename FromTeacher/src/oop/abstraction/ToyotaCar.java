package oop.abstraction;

public class ToyotaCar extends SemiCar implements Car{
	
	public void driveMiles(){
		System.out.println("Car can drive 100 mph");	
	}
	
	public void sedan(){
		System.out.println();
	}
	//From Car Interface
	public void start() {
		System.out.println("Start a car to drive");
		
	}
	//From Car Interface
	public void manualBrake() {
		System.out.println("Apply brakes to stop");
		
	}
	//From Car Interface
	public void wheel() {
		System.out.println("Have 4 wheels to move");
		
	}
	//From SemiCar Abstract Class
	public void electricVehicle() {
		System.out.println("Engine runs by Electric power");
		
	}

	public void motorCar() {
		System.out.println("Motor car");
		
	}
}
