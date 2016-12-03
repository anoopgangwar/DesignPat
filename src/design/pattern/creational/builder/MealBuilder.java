package design.pattern.creational.builder;

public class MealBuilder 
{

	public Meal prepareVegMeal()
	{
		Meal meal = new Meal();
		meal.additem(new VegBurger());
		meal.additem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal()
	{
		Meal meal = new Meal();
		meal.additem(new NonVegBurger());
		meal.additem(new Pepsi());
		meal.additem(new Coke());
		return meal;
	}
	
}
