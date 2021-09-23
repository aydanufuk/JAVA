class Singleton1 {
	
	private static Singleton1 single_instance = null;

	
	public String s;

	
	private Singleton1() //private Constructor
	{
		s = "singleton class";
	}

	
	public static Singleton1 getInstance() //static method is used to create singleton object
	{
		if (single_instance == null)
			single_instance = new Singleton1();

		return single_instance;
	}
}