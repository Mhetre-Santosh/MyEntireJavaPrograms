package StringFunctions;  // Assignment 57 = Input: priya
                          /*output:
                                   a
                                   y
                                   i
                                   r
                                   p*/

public class PriyaPrintVerticalibutfromending {

	public static void main(String[] args) {
		
		String input = "priya";
		
		for (int i= input.length()-1;i>=0;i--)
          {
			System.out.println(input.charAt(i));
          }

	}

}
