package desgin.pattern.creational.prototype;

public class PrototypePatternDemo 
{

	public static void main(String[] args) {
		ShapeCache sc = new ShapeCache();
		sc.loadCache();
		sc.getShape("1").draw();
		sc.getShape("2").draw();
		sc.getShape("3").draw();
	}
}
