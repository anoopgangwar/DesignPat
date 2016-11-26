package design.pattern.creational.singleton;

public class SingletonObjectByThreadSafe 
{
	private static SingletonObjectByThreadSafe instance;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SingletonObjectByThreadSafe()
	{
		
	}
	
	public static synchronized SingletonObjectByThreadSafe getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonObjectByThreadSafe();
		}
		return instance;
	}
}
