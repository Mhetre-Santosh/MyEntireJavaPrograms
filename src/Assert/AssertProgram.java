// Assignment 94 = Write a assertion program when 
// name has empty string, some error should be thrown with the assertion message as well
package Assert;

public class AssertProgram {

	public static void main(String[] args) 
	{
		String name = "";
		
		assert name.length()>0:"The length is 0 or less";
		
		System.out.println(name+ " Mhetre");

	}

}
