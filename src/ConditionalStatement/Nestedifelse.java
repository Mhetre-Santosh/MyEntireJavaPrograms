package ConditionalStatement;

public class Nestedifelse {

	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
		if (a<b)
		{
			if (a != b)
			{
				if (a == b)
				{
				System.out.println("one");
				}
				else
				{
					System.out.println("two");
				}
			}
			else
			{
				System.out.println("three");
			}
		}
		else
		{
			System.out.println("four");
		}
		
	}
}
