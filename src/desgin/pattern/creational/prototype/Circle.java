package desgin.pattern.creational.prototype;

public class Circle extends Shape
{

	public Circle() {
		type="Circle";
	}
	
	@Override
	void draw() {
		System.out.println("In a circle class : draw");		
	}

}
