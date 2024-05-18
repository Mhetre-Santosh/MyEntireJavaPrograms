package Array;  //Assignment 67 = How to check if two Arrays are equals to each other

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualsMethod {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int[] rollno = new int[3];
		
		for(int i = 0; i<rollno.length; i++)
		{
			System.out.println("Enter the Array-> "+i);
			rollno[i]= x.nextInt();
		}
		
		int[] rollno1 = new int[3];
		
		for(int i = 0; i<rollno1.length; i++)
		{
			System.out.println("Enter the Array1-> "+i);
			rollno1[i]= x.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		x.close();
		
		//System.out.println(Arrays.equals(rollno,rollno1));
		
		if(Arrays.equals(rollno,rollno1))
		{
			System.out.println("Hey you did magic 2 arrays are exactly same");
		}
		else
		{
			System.out.println("Sorry, two array are different");
		}

	}

}
