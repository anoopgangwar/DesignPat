package design.pattern.creational.singleton;

public class MainServ 
{
	public static void main(String[] args) 
	{	
		// By Static vaiable
		SingleObjectByStatic sOb = SingleObjectByStatic.getInstance();
		sOb.setName("Anoop");
		System.out.println(sOb.getName());
		SingleObjectByStatic sOb1 = SingleObjectByStatic.getInstance();
		System.out.println(sOb1.getName());
		sOb1.setName("D");
		System.out.println(sOb.getName());
		System.out.println(sOb1.getName());
		// By Static Block
		SingletonObjectByStaticBlock sOs = SingletonObjectByStaticBlock.getInstance();
		sOs.setName("FF");
		SingletonObjectByStaticBlock sOs1 = SingletonObjectByStaticBlock.getInstance();
		sOs1.setName("FG");
		System.out.println(sOs.getName());
		System.out.println(sOs1.getName());
		// By Lazy Initialization
		
	}
}
