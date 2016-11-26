package design.pattern.creational.factory;

public class Circle implements Shape 
{

	protected Circle()
	{}
	
	@Override
	public void draw() {
		System.out.println("In Circle class's override method draw");		
	}
	
}
