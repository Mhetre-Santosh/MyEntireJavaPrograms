package Array;  // Assignment 63 = Create an array for Student 
               //the size of array should be coming from the Scanner Class 

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		
		String[] names = new String[4];
		
		names[0] = "Jyothi";
		names[1]= "Nitin";
		names[2]= "Shaik";
		names[3]= "Raghu";
		
		Scanner x = new Scanner(System.in);
		
		int a = x.nextInt();
		x.close();
		
		for (int i=0; i<=a; i++)
		{
			System.out.println(names[i]);
			x.close();
		}

	}

}
