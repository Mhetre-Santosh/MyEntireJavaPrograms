package Array; // Assignment 65 = Create an array and print using the Arrays Class 

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int[] rollno = new int[3];
		
		for(int i = 0; i<rollno.length; i++)
		{
			System.out.println("Enter the Array-> "+i);
			rollno[i]= x.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		x.close();
	} 

}
