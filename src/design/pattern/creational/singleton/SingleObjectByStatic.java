package design.pattern.creational.singleton;

public class SingleObjectByStatic 
{
	private static final SingleObjectByStatic instance = new SingleObjectByStatic();
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SingleObjectByStatic()
	{
		
	}
	
	public static SingleObjectByStatic getInstance()
	{
	return instance;	
	}
	
	public void getMessage()
	{
		System.out.println("Hello");
	}
}
