package oop.polymorphism;

public class ModernShapeCalculator extends ShapeCalculator{

	@Override
	public int areaOfLand(int a, int b, int c, int d){
		int total = a + b + c + d - this.restult;
		return total;
	}
}
