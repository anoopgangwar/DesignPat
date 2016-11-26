package design.pattern.creational.factory;

public class ShapeFactory 
{
	public static Shape getShape(String shapeType)
	{
		Shape shape = null;
		if("R".equals(shapeType))
		{
			shape = new Rectangle();
		}
		else if("S".equals(shapeType))
		{
			shape = new Square();
		}
		else if("C".equals(shapeType))
		{
			shape = new Circle();
		}		
		return shape;
	}
}
