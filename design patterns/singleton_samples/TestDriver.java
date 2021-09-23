class TestDriver {
	
	public static void main(String args[])
	{
		
		Singleton1 x = Singleton1.getInstance();

		
		Singleton1 y = Singleton1.getInstance();

		
		Singleton1 z = Singleton1.getInstance();

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