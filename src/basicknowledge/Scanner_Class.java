package basicknowledge;

import java.util.Scanner;

public class Scanner_Class {

	
	public static void main(String[] args) 

	{

		Scanner  s1 = new Scanner(System.in);
		
		int a =    s1.nextInt(); 
		int b =    s1.nextInt(); 
		
		int sum = a + b;
		System.out.println("Sum of a + b =  " + sum);
		
		s1.close();
	}

}
