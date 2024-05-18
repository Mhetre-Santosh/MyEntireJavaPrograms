package StringFunctions; //  Assignment 55 = Practice String problems all of them

public class Stringf
{

	public static void main(java.lang.String[] args)
	{	
		String name = "School";
				
		System.out.println(name.length());        // to find the number alphabet present or length
		System.out.println(name.charAt(0));      // Giving the character of given index position
		System.out.println(name.indexOf('c'));   // Giving the index of given character position
		System.out.println(name.toUpperCase());  // To change the string to upper case
		System.out.println(name.toLowerCase());  // To change the string to lower case
		System.out.println(name.concat(" name is TSSM"));     
		String firstname = "santosh";
		String lastname = "Mhetre";
		System.out.println(firstname.concat(" ").concat(lastname));
		System.out.println(name.contains("sch"));
	}

}
