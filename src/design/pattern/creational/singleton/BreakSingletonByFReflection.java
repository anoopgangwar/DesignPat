package design.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class BreakSingletonByFReflection 
{
	public static void main(String[] args) 
	{
		SingletonObjectByBillPugh sBPs = SingletonObjectByBillPugh.getInstance();
		SingletonObjectByBillPugh sBPs2 = SingletonObjectByBillPugh.getInstance();
		SingletonObjectByBillPugh sBPs1= null;
		try
		{
			Constructor[] cons = SingletonObjectByBillPugh.class.getDeclaredConstructors();
			for(Constructor consturctor : cons)
			{
				consturctor.setAccessible(true);
				sBPs1 = (SingletonObjectByBillPugh) consturctor.newInstance();
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		System.out.println(sBPs.hashCode());
		System.out.println(sBPs1.hashCode());
		System.out.println(sBPs2.hashCode());
	}
}
