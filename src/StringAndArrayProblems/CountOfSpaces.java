package StringAndArrayProblems;

import java.util.Arrays; // Assignment 71 = In  a String Manish Kumar Tiwari
                         // find out the number of spaces involved

public class CountOfSpaces {

	static int countofspace = 0;
	public static void main(String[] args) {
String name = "Manish Kumar Tiwari";
		
		char[] c1 = name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<c1.length;i++)
		{
		boolean answer =  Character.isSpaceChar(c1[i]);
		
		
		if (answer == true)
		{
		countofspace++;
		}
	
		}
		
		System.out.println(countofspace);
	}

}
