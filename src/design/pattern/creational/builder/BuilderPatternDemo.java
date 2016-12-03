package design.pattern.creational.builder;

public class BuilderPatternDemo 
{
	public static void main(String[] args) 
	{
		MealBuilder mb = new MealBuilder();
		Meal meal = mb.prepareVegMeal();
		meal.showItems();
		System.out.println(meal.getCost());
		Meal nonmeal = mb.prepareNonVegMeal();
		nonmeal.showItems();
		System.out.println(nonmeal.getCost());
	}
}
