package design.pattern.creational.aabstract.factory;

public class FruitFactory implements Factory
{
	@Override
	public Fruit getFruit(String fruitType)
	{
		Fruit fruit = null;
		if(fruitType != null)
		{
			if("M".equals(fruitType))
			{
				fruit = new Mango();
			}
			else if("A".equals(fruitType))
			{
				fruit = new Apple();
			}
		}
		return fruit;
	}

	@Override
	public Shape getShape(String choice) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
