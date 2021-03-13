package playground.week4;

import playground.week1.Example1.SimpleLocation;

public class CollegeTester
{
	
	public CollegeTester (Student s, Faculty f)
	{
	}
	

	public static void main(String[] args)
	{
		Student s = new Stud4ent("Sonia");
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();
		
		String n = s.getName();
		p = s;
		o = s;
		System.out.println(n);
		
	}
}
