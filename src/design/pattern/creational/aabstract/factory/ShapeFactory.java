package design.pattern.creational.aabstract.factory;

public class ShapeFactory implements Factory
{
 @Override
 public Shape getShape(String shapeType)
 {
	 Shape shape = null;
	 if(shapeType != null)
	 {
		 if("S".equals(shapeType))
		 {
			 shape = new Square();
		 }
 	 	 else if("C".equals(shapeType))
		 {
			 shape = new Circle();
		 }
	 }
	 return shape;	 
 }

@Override
public Fruit getFruit(String fruitType) {
	// TODO Auto-generated method stub
	return null;
}
}
