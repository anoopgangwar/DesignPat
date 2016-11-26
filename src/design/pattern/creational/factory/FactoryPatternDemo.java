package design.pattern.creational.factory;

public class FactoryPatternDemo {
public static void main(String[] args) {
	ShapeFactory.getShape("R").draw();
	ShapeFactory.getShape("C").draw();
	ShapeFactory.getShape("S").draw();
	
	Circle c=new Circle();
	c.draw();
}
}
