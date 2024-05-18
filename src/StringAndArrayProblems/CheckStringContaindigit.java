// Assignment 89 = How to check if the String Contains Only Digits?
package StringAndArrayProblems;

public class CheckStringContaindigit {
	
	static int countofnumeric = 0;
	public static void main(String[] args) {
		
		String name = "Santosh123";
		
		char[] c1 = name.toCharArray();
		
		//System.out.println(c1);
		
		for (int i=0; i<name.length();i++)
		{
			boolean answer =  Character.isDigit(c1[i]);
		
		
			if( answer == true)
			{
				countofnumeric++;
			}
			
		}
		System.out.println("Number of digit present ->  "+countofnumeric);
		
		if (countofnumeric != 0)
		{
			System.out.println("It contain Digit.");
		}
		else
		{
			System.out.println("It not contain Digit.");
		}

	}

}
