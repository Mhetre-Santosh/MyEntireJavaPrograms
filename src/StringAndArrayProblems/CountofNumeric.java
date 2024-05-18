package StringAndArrayProblems;

import java.util.Arrays; // Assignment 70 = In  a String Manish124
                         // find out the number of numeric values involved

public class CountofNumeric {

static int countofnumeric = 0;
	
	public static void main(String[] args) {
		
		String name = "Manish124";
		
		char[] c1 = name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for (int i=0; i<c1.length;i++)
		{
		boolean answer =  Character.isDigit(c1[i]);
		
		
		if (answer == true)
		{
		countofnumeric++;
		}
	
		}
		
		System.out.println(countofnumeric);
		
	}

}
