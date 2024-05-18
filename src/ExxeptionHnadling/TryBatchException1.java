package ExxeptionHnadling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryBatchException1 
{

	public static void main(String[] args)
	{
		
			
		Scanner s1 = new Scanner (System.in);
		
	    try
		{
		
		int age = s1.nextInt();
		System.out.println(age);
		
		}
		
		catch(InputMismatchException a1)
		{
			System.out.println("Handed the Exception 1");
		}
		
	    catch(NullPointerException a2)
		{
	    	System.out.println("Handed the Exception 2");
		}
		
	    catch(IndexOutOfBoundsException a3)
		{
	    	System.out.println("Handed the Exception 3");
		}
	

	}

}
