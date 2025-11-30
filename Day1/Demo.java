class Demo
{
	int a = 10;

	void m1()
	{
		System.out.println("i am instance method");
	}

	static int b = 20;
	
	static void m2()
	{
		System.out.println("i am static method");
	}


	public static void main(String[] args)
	{
		//print instance variable and methods

		Demo d1 = new Demo();
		System.out.println(d1.a);
		d1.m1();
		

		//print static variables and methods

		System.out.println(Demo.b);
		Demo.m2();
	}
}