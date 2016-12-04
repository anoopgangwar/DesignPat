package desgin.pattern.creational.prototype;

public class Rectangel extends Shape 
{
	Rectangel()
	{
		type = "Rectangel";
	}
	
	@Override
	void draw() {
		
		System.out.println("In a Rectangle class : Draw");
		
	}

}
