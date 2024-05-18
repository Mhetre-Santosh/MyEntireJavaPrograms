package StringAndArrayProblems;

import java.util.Arrays;

// Assignment 75 = Find out if 2 given strings are anagram of each other
public class Anagram 
{

	public static void main(String[] args)
	{
		String input1 = "ram";
		String input2 = "arm";
		
		if(input1.length() != input2.length())
		{
			System.out.println("They are not anagram");
		}
		
		else
		{
		char[] c1 = input1.toCharArray();
		char[] c2 = input2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println("After sorting ->  ");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("They are anagram");
		}
		else
		{
			System.out.println("They are not anagram");
		}
		}
	}

}
