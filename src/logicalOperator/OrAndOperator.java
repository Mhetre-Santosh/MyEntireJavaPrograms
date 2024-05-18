package logicalOperator;

public class OrAndOperator {

	public static void main(String[] args) 
	
	{
		
		int a = 10;
		int b = 20;
		
		if ((a > 6) ||(a==b))
		{
			System.out.println("Or Opertaor");
		}
		
		if ((a>6  && a!=b))
		{
			System.out.println("And Operator");
		}

	}
}