package design.pattern.creational.aabstract.factory;

public class MainServ
{
	public static void main(String[] args) 
	{
		FactoryProducer.getFactory("S").getShape("C").draw();
		FactoryProducer.getFactory("F").getFruit("M").eat();		
	}
}
