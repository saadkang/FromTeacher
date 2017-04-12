package oop.polymorphism;

public class TestShape {

	public static void main(String[] args) {
		ShapeCalculator shape = new ShapeCalculator();
		int resultOfLine = shape.areaOfLand(1, 15);
		System.out.println("Shape Calculator: "+resultOfLine);
		int resultOfTriangle = shape.areaOfLand(10, 15, 12);
		System.out.println("Shape Calculator Triangle: "+resultOfTriangle);
		int resultOfRectangle = shape.areaOfLand(10, 15, 12, 13);
		System.out.println("Shape Calculator Rectangle: "+resultOfRectangle);
		
		ModernShapeCalculator modern = new ModernShapeCalculator();
		int resultOfTriangleMC = modern.areaOfLand(10, 15, 12);
		System.out.println("Modern Calculator Triangle: "+resultOfTriangleMC);
		int resultOfRectangleMC = modern.areaOfLand(10, 15, 12, 13);
		System.out.println("Modern Calculator Rectangle: "+resultOfRectangleMC);

	}

}
