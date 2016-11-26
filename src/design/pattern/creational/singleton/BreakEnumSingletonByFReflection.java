package design.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class BreakEnumSingletonByFReflection 
{
	public static void main(String[] args) 
	{
		SingletonObjectByEnum en = SingletonObjectByEnum.instance;
		SingletonObjectByEnum en1 = null;
		try
		{
			Constructor[] cons = SingletonObjectByEnum.class.getDeclaredConstructors();
			for(Constructor consturctor : cons)
			{
				consturctor.setAccessible(true);
				en1 = (SingletonObjectByEnum) consturctor.newInstance();
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		System.out.println(en.hashCode());
		System.out.println(en1.hashCode());
	}
}
