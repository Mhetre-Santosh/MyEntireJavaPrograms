package basicknowledge;

public class NonStaticmethod {
	
	void add ()  // 1st non-static method.
	{
		System.out.println(5-4);
	}
	
	void sub()  // 2nd non-static method
	{
		int a = 300;
		int b = 200;
		System.out.println(a-b);
	}

	public static void main(String[] args)
	{
		
		NonStaticmethod x = new NonStaticmethod ();  // syntax to create object.
		
		x.add();     // called 1st non-static method.
		x.sub();     // called 2nd non-static method by using same object. no need to create different object.
		
		
	}

}
