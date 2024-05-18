
// Assignment 81 = Program to check  if the input "Manish" starts with 'M'
// Assignment 82 = Program to check  if the input "Manish" ends with 'h'
// Assignment 83 = Program to check  if the string contains 5 letters in it
// Assignment 84 = Program to check  the last index of a  character in a String "School"

package StringAndArrayProblems;
public class Matches 
{

	public static void main(String[] args) 
	{
		String name = "Manish";
		
		boolean output = name.matches("M(.*)");
		
		System.out.println(output);
		
		boolean output1 = name.matches("(.*)h");
		
		System.out.println(output1);
		
		String ip = "malik";
		
		boolean output3 = ip.matches(".....");
		
		System.out.println(output3);
		
		String a1 = "School";
		
		int a2 = a1.lastIndexOf('o');
		
		System.out.println(a2);
				

	}

}
