package desgin.pattern.creational.prototype;

public abstract class Shape implements Cloneable
{
	private String id;
	public String type;
	abstract void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
	
	@Override
	protected Object clone(){
		// TODO Auto-generated method stub
		Object clonedObj = null;
		try
		{
			clonedObj = super.clone();
		}
		catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		return clonedObj;
	}
}
