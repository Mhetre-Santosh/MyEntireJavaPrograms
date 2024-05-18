package StringAndArrayProblems; // Assignment 69 = In  a String Manish

import java.util.Arrays;

//find out the number of alphabets involved

public class CountofAlphabet {
	
	static int countofalpha = 0;
	
	public static void main(String[] args) {
		
		String name = "Manish santosh";
		
		char[] c1 = name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<c1.length;i++)
		{
		boolean answer =  Character.isAlphabetic(c1[i]);
		
		
		if (answer == true)
		{
		countofalpha++;
		}
	
		}
		
		System.out.println(countofalpha);
		
	}

}
