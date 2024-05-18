package StringAndArrayProblems; //Assignment 72 = In  a String Manish!@#
                                //find out the number of specail characters involved

import java.util.Arrays;

public class CountOfSpacialChar 
{
	
		static int countofalpha = 0;
		static int countofnumeric = 0;
		static int countofspace = 0;
		static int countofspecialchar = 0;
		
		public static void main(String[] args)
		{
			
			
			String name = "Manish!@#";
			
			
			// To find Number OF ALPHA
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
			
			
			// To find Number OF Numeric
			char[] c2 = name.toCharArray();
			for (int i=0; i<c2.length;i++)
				{
					boolean answer =  Character.isDigit(c2[i]);
					if (answer == true)
						{
							countofnumeric++;
						}
				}	
			
			
			// To find Number OF Space
			for (int i=0; i<c1.length;i++)
				{
					boolean answer =  Character.isSpaceChar(c1[i]);
					if (answer == true)
						{
							countofspace++;
						}
				}
			
			int length = name.length();		
			countofspecialchar = length-countofalpha-countofnumeric-countofspace;
			System.out.println("Number of Special Char is ->  " +countofspecialchar);

	}

}
