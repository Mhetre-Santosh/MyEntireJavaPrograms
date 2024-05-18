package StringAndArrayProblems;
//Assignment 74 = In the given array find out 41 is present or not. and display its count

public class numbre41presentornot {

	public static void main(String[] args) {
		
		int [] nos = new int[4];
		
		nos[0]= 10;
		nos[1]= 41;
		nos[2]= 40;
		nos[3]= 41;
		
		int givenno = 41;
		
		for(int i = 0; i<nos.length; i++)
		{
			if (givenno == nos[i])
			{
				System.out.println("Number is present in the given Array in the index position "+ i);
				
			
				System.out.println("Number of Count of 41 in given Array is ->  "+i);
			}
			else
			{
				System.out.println("Number is not present in the given Array in the index position "+ i);
			}
		}

	}

}
