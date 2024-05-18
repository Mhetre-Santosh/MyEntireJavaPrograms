package logicalOperator;

public class NotOperator {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		if (!(a == b ||b != a))
		{
			System.out.println("Or Oprator with Not operator");
		}
		if (!(a == b && b != a))
		{
			System.out.println("And Oprator with Not operator");
		}
	}

}
