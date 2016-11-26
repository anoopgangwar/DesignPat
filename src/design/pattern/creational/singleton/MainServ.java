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
		System.out.println("------------ Draw Backs : 1) Work fine in single threaded environment, but will fail in multithreaded environment." +
				"--------------");
		// By Thread Safe Singleton
		System.out.println("------------ Thread Safe Singleton --------------");
		SingletonObjectByThreadSafe sTs = SingletonObjectByThreadSafe.getInstance();
		sTs.setName("cv");
		SingletonObjectByThreadSafe sTs1 = SingletonObjectByThreadSafe.getInstance();
		sTs1.setName("xc");
		System.out.println(sTs.getName());
		System.out.println(sTs1.getName());
		System.out.println("------------Drawbacks: 1) it provide thread safe singleton class. but it reduce performance beacase of cost associated eith syncronized method.");
		
		// By Double Check Locking
		SingletonObjectByDoubleCheckLocking sDCs = SingletonObjectByDoubleCheckLocking.getInstance();
		sDCs.setName("Double check");
		SingletonObjectByDoubleCheckLocking sDCs1 = SingletonObjectByDoubleCheckLocking.getInstance();
		sDCs1.setName("OOOO Double Check");
		System.out.println(sDCs.getName());
		System.out.println(sDCs1.getName());
		System.out.println("-------------Drawbacks: NAN");
		
		// By Bill Pugh
		SingletonObjectByBillPugh sBPs = SingletonObjectByBillPugh.getInstance();
		sBPs.setName("Oye");
		SingletonObjectByBillPugh sBPs1 = SingletonObjectByBillPugh.getInstance();
		sBPs1.setName("HOye");
		System.out.println(sBPs.getName());
		System.out.println(sBPs1.getName());
		System.out.println("--------------- Drawbacks: NAN");
		/*
		 * Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
			This is the most widely used approach for Singleton class as it doesn’t require synchronization. I am using this approach in many of my projects and it’s easy to understand and implement also.
		 * 
		 */
		  
		
	}
}
