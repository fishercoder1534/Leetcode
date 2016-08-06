package designPatterns.factory_pattern;

public class MainApp {

	public static void main(String... args){
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShapeType("circle");
		shape.draw();
		
		shape = shapeFactory.getShapeType("Rectangle");
		shape.draw();
		
		shape = shapeFactory.getShapeType("Square");
		shape.draw();
	}
}
