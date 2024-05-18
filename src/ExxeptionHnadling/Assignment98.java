package ExxeptionHnadling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment98 {

	public static void main(String[] args) {
	
		Scanner s1= new Scanner(System.in);
		
		try
		{
			int n1= s1.nextInt();
				
		}	
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			
		}
		catch(InputMismatchException e2)
		{
				
		}
				
		String[] name= new String[n1];
		
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="Hanuman";	
		
		for (int i=0; i<n1; i++)
		{
			System.out.println(name[i]);
			
		}
		

	}

}
