package StringAndArrayProblems; //Assignment 73 = Find out if given input is a palindrome

public class Palindrome {  

	public static void main(String[] args) {
		
		
		String input = "mom";
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--)
		{
			char op = input.charAt(i);
			reverse = reverse+op;
		}
		
		System.out.println(reverse);
		
		if (input.equals(reverse))
		{
			System.out.println("It is Palindorme");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}

	}

}
