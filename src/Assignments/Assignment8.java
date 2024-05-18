package Assignments;          //Assignment 8 =  Program to do add,sub,mul,mod using global variable

public class Assignment8 {
	
	int a = 8;
	int b = 2;
	
	static int c = 50;
	static int d = 10;

	int sub = a - b;
	int mul = a * b;
	int mod = a % b;
	int div = a / b;
	
	static int sub2 =  c - d;
	static int mul2  =  c * d;
	static int mod2  =  c % d;
	static int div2  =  c / d;

	public static void main(String[] args)
	{
		Assignment8 x = new Assignment8 ();
		
		int add = x.a + x.b;
		
		System.out.println(add);
		System.out.println(x.sub);  
		System.out.println( x.mul);
		System.out.println(x.mod);
		System.out.println(x.div);
		
		int add2 = c + d;
		
		System.out.println(add2);
		System.out.println(sub2);
		System.out.println(mul2);
		System.out.println(mod2);
		System.out.println(div2);
		 	 
	}

}
