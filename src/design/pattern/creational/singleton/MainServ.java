package design.pattern.creational.singleton;

public class MainServ 
{
	public static void main(String[] args) 
	{	
		// By Static vaiable
		System.out.println("------------ Eager Intitialization --------------");
		SingleObjectByStatic sOb = SingleObjectByStatic.getInstance();
		sOb.setName("Anoop");
		System.out.println(sOb.getName());
		SingleObjectByStatic sOb1 = SingleObjectByStatic.getInstance();
		System.out.println(sOb1.getName());
		sOb1.setName("D");
		System.out.println(sOb.getName());
		System.out.println(sOb1.getName());
		System.out.println("------------ Draw Backs : 1) create a class instance eveb though client application might not using it" +
				" 2) No option of exception handling --------------");
		// By Static Block
		System.out.println("------------ Static Block Intitialization --------------");
		SingletonObjectByStaticBlock sOs = SingletonObjectByStaticBlock.getInstance();
		sOs.setName("FF");
		SingletonObjectByStaticBlock sOs1 = SingletonObjectByStaticBlock.getInstance();
		sOs1.setName("FG");
		System.out.println(sOs.getName());
		System.out.println(sOs1.getName());
		System.out.println("------------ Draw Backs : 1) create a class instance eveb though client application might not using it" +
				"--------------");
		// By Lazy Initialization
		System.out.println("------------ Lazy Intitialization --------------");
		SingleObjectByLazyInitialization sLs = SingleObjectByLazyInitialization.getInstance();
		sLs.setName("aa");
		SingleObjectByLazyInitialization sLs1 = SingleObjectByLazyInitialization.getInstance();
		sLs1.setName("bb");
		System.out.println(sLs.getName());
		System.out.println(sLs1.getName());
		System.out.println("------------ Draw Backs : 1) create a class instance eveb though client application might not using it" +
				" 2) No option of exception handling --------------");
	}
}
