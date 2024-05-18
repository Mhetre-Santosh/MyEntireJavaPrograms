package Assignments;  // Assignment 2 =  "static method Program for add,sub,multiplication,division,modules"
public class Assignment2 {
	static void Add()
	{
		int a= 200;
		int b= 300;
		System.out.println(a+b);
	}
	static void Sub()
	{
		int a = 300;
		int b = 200;
		System.out.println(a-b);
	}
	static void mul ()
	{
		int a = 10;
		int b = 10;
		System.out.println(a*b);
	}
	static void Div ()
	{
		int a = 400;
		int b = 100;
		System.out.println(a/b);
	}
	static void mod()
	{
		int a = 400;
		int b = 100;
		System.out.println(a%b);
	}
	public static void main(String[] args)
	{
		Add();
		Sub();
		mul();
		Div();
		mod();	
	}
}
