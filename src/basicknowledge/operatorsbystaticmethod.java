package basicknowledge;

public class operatorsbystaticmethod {
	
	static void Add()
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void Sub()
	{
		int a = 300;
		int b = 200;
		int sub = a-b;
		System.out.println(sub);
	}
	
	static void mul()
	{
		int a = 100;
		int b = 200;
		int mul = a*b;
		System.out.println(mul);
	}
	
	static void div()
	{
		int a = 400;
		int b = 200;
		int sum = a/b;
		System.out.println(sum);
	}
	
	static void mod()  // modules means remainder 
	{
		int a = 7;
		int b = 2;
		int sum = a%b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		Add();
		Sub();
		mul();
		div();
		mod();
		
		

	}

}
