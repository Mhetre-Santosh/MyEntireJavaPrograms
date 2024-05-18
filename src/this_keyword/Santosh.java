package this_keyword;  // Assignment 35 = Program to demonstrate THIS KEYWORD

public class Santosh 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		this.age = age;
		this.name=name;
		this.salary=salary;
		// System.out.println(name+ age+ salary);
	}
	
	public static void main(String[] args)
	{
		Santosh x = new Santosh ();
		x.student_details(90, "Santosh" , 50.00);
		System.out.println(x.age);
		System.out.println(x.name);
		System.out.println(x.salary);

	}

}
