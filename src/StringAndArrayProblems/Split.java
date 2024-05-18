
// Assignment 86 = Program to split the input string using  split function
package StringAndArrayProblems;

import java.util.Arrays;

public class Split 
{
	public static void main(String[] args) 
	{
		String a1 = "My name is Manish";
		
		String a2[] = a1.split("M"); // Split from M
		
		System.out.println(Arrays.toString(a2)); // Convert String to Array
		
	}

}
