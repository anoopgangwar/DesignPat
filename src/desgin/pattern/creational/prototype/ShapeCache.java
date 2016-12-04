package desgin.pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache 
{
	private Map<String, Shape> map = new HashMap<String, Shape>();
	public Shape getShape(String id)
	{
		return (Shape)map.get(id).clone();				
	}
	
	public void loadCache()
	{
		Circle c = new Circle();
		c.setId("1");
		Square s = new Square();
		s.setId("2");
		Rectangel r = new Rectangel();
		r.setId("3");
		map.put(c.getId(),c);
		map.put(s.getId(),s);
		map.put(r.getId(),r);
	}
}
