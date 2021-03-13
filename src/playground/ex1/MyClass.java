package playground.ex1;

public class MyClass 
{
public int a;
public double b;
public MyClass(int first ,double second)
{
	System.out.println("called constructor");
	this.a = first;
	this.b = second;
}
public boolean same (MyClass other)
{
	System.out.println("called same method");
	return other.a == this.a && other.b == this.b;
}
}
