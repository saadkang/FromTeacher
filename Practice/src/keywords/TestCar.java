package keywords;

public class TestCar {

	public static void main(String[] args) {
		ElectricCar modelS = new ElectricCar();
		ElectricCar model3 = new ElectricCar("Model X", 2016);
		model3.getCarInfo();
		model3.engine();
		model3.model();
		modelS.engine();
	}
}
