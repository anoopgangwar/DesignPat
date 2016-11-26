package design.pattern.creational.aabstract.factory;

public class FactoryProducer 
{
	public static Factory getFactory(String choice)
	{
		Factory factory = null;
		if(choice != null)
		{
			if("S".equals(choice))
			{
				factory = new ShapeFactory();
			}
			else if("F".equals(choice))
			{
				factory = new FruitFactory();
			}
		}
		return factory;
	}	
}
