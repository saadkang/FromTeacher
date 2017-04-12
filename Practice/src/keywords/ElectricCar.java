package keywords;

public class ElectricCar extends Car {

	public ElectricCar(){
	
	}
	public ElectricCar(String carModel,int year){
		super(carModel,year);
	}
	public void getCarInfo(){
		System.out.println("This is Toyota Car");
	}
	
	public void engine(){
		System.out.println("It will also run as Hybrid");
		super.engine();
	}
	public void model(){
		super.carModel= "Corolla";
		System.out.println(carModel);
	}
}
