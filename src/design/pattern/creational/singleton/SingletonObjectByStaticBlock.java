package design.pattern.creational.singleton;

public class SingletonObjectByStaticBlock 
{
	private static  SingletonObjectByStaticBlock instance;
	
	private String name;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static
	{
		try
		{
			instance = new SingletonObjectByStaticBlock();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	
	private SingletonObjectByStaticBlock()
	{
		
	}
	
	public static SingletonObjectByStaticBlock getInstance()
	{
		return instance;
	}
	
}
