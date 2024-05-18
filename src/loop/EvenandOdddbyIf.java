package loop;   //Assignment 45 = Write For loop for even or odd numbers 2 programs

public class EvenandOdddbyIf {

	public static void main(String[] args)
	{
		for (int i = 1; i<=100; i++)
		{
			if (i%2 == 0)
			{
				System.out.println("Even number "+i);
			}
			else
			{
				System.out.println("Odd number "+i);
			}
		}
		

	}

}
