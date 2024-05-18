package StringAndArrayProblems;
  // Assignment 77 = Program to remove all 'o' in the given string 'School123'
  // Assignment 78 = Program to replace all 'O' alphabets with 'M' in a given string( School123)
  // Assignment 79 = Program to remove all the numeric values involved in a given string
public class RemovingLetterformString 
{

	public static void main(String[] args) 
	{
		String input = "School123";
		
		String output = input.replace('o', ' '); // To remove 'o'
		
		System.out.println(output);
		
		String output1 = input.replace('o', 'm'); // To replace 'o' with 'm'
		
		System.out.println(output1);
		
		String output2 = input.replaceAll("[a-z]"," "); // To remove a to z (Lower case) alphabet
		
		System.out.println(output2);
		
		String output3 = input.replaceAll("[A-Z]"," "); // To remove A to Z (Upper case) alphabet
		
		System.out.println(output3);
		
		String output4 = input.replaceAll("[0-9]"," "); // To remove 0 to 9 (All numeric value)
		
		System.out.println(output4);
		

	}

}
