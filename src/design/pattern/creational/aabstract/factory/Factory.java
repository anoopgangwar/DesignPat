package design.pattern.creational.aabstract.factory;

public interface Factory 
{
	Shape getShape(String choice);
	Fruit getFruit(String fruitType);
}
