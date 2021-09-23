
class Singleton1 {
	
	private static Singleton1 single_instance = null;

	
	public String s;

	
	private Singleton() //private Constructor
	{
		s = "singleton class";
	}

	
	public static Singleton getInstance() //static method is used to create singleton object
	{
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}


class TestDriver {
	
	public static void main(String args[])
	{
		
		Singleton x = Singleton.getInstance();

		
		Singleton y = Singleton.getInstance();

		
		Singleton z = Singleton.getInstance();

		// printing hashcodes of the objects
		System.out.println("Hashcode of x is "
						+ x.hashCode());
		System.out.println("Hashcode of y is "
						+ y.hashCode());
		System.out.println("Hashcode of z is "
						+ z.hashCode());

		
		if (x == y && y == z) {

			
			System.out.println(
				"same memory location on the heap  same object");
		}

		else {
		
			System.out.println(
				"NOT point to the same memory location on the heap");
		}
	}
}
