package design.pattern.creational.singleton;

public class SingletonObjectByBillPugh 
{
	private static class SingletonHelper
	{
		private static final SingletonObjectByBillPugh INSTANCE = new SingletonObjectByBillPugh(); 
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static SingletonObjectByBillPugh getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}
