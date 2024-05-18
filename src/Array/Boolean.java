package Array; //Assignment 68 = Create an array with datatype boolean of size 3 
		       //and takes the value of array using Scanner class

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		boolean[] Rollnumber = new boolean [3];
		for (int i = 0; i <=2; i++)
		{
			System.out.println("Enter the Array-> "+ i);
			Rollnumber[i] = x.nextBoolean();
			System.out.println(Rollnumber[i]);
			
		}
		
		x.close();

	}

}
