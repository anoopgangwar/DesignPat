package design.pattern.creational.singleton;

public class SingleObjectByLazyInitialization 
{
	private static SingleObjectByLazyInitialization instance;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SingleObjectByLazyInitialization()
	{
		
	}
	
	public static SingleObjectByLazyInitialization getInstance()
	{
		if(instance == null)
		{
		  instance = new SingleObjectByLazyInitialization();
		}
		return instance;
	}
	
}
