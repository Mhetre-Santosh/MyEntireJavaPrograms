package Array; //Assignment 66 = How to check if two strings are equals to each other

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEqualsInString {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		String[] names = new String[2];
		
		for (int i = 0; i<names.length; i++)
		{
			System.out.println("Enter the name 1st Array -> "+ i);
			names[i] = x.next();
		}
		
		String[] names1 = new String[2];
		
		for (int i = 0; i<names1.length; i++)
		{
			System.out.println("Enter the name 2nd Array -> "+ i);
			names1[i] = x.next();
		}
		
		
		
		if(Arrays.equals(names, names1))
		{
			System.out.println("Hey you did magic 2 arrays are exactly same");
		}
		else
		{
			System.out.println("Sorry, two array are different");
		}
		x.close();
		

	}

}
