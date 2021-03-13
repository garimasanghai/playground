package playground.ex1;

public class MyClassTester {

	public static void main(String[] args)
	{
		MyClass c1 = new MyClass (30, 123.9);
		MyClass c2 = new MyClass (30, 29.7);
		MyClass c3 = new MyClass (c1.a, c2.b);
		c2.same(c3);
		System.out.println(c2.same(c3));

	}

}
