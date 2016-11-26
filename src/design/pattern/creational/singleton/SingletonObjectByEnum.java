package design.pattern.creational.singleton;

public enum SingletonObjectByEnum 
{
	instance;
	private String name;
	
	private SingletonObjectByEnum()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
