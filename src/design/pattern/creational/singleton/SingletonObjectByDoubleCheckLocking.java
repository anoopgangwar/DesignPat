package design.pattern.creational.singleton;

public class SingletonObjectByDoubleCheckLocking 
{
	private static SingletonObjectByDoubleCheckLocking instance;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SingletonObjectByDoubleCheckLocking()
	{
		
	}
	
	public static SingletonObjectByDoubleCheckLocking getInstance()
	{
		if(instance == null)
		{
			synchronized (SingletonObjectByDoubleCheckLocking.class) {
				 if(instance == null)
				 {
					 instance = new SingletonObjectByDoubleCheckLocking();
				 }
			}
			
		}
		
		return instance;
	}
}

