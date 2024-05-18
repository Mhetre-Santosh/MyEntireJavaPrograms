package Array; //Assignment 64 = Create a array of data type int of size 3 
               //and takes the value of array using Scanner class

import java.util.Scanner;

public class ArrayAtRunTime {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		int[] Rollnumber = new int [3];
		for (int i = 0; i <=2; i++)
		{
			System.out.println("Enter the Array-> "+ i);
			Rollnumber[i] = x.nextInt();
			System.out.println(Rollnumber[i]);
			
		}
		
		x.close();

	}

}
