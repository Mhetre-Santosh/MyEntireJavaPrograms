
// Assignment 87 = Create a Array length size[4]of int data  type find out the average of those 4 numbers
package StringAndArrayProblems;

public class AverageValueofArray 
{
	static double Avarage = 0;
	static int Sum = 0;

	public static void main(String[] args) 
	{
		int number[] = new int[4];
		
		number[0] = 14;
		number[1] = 15;
		number[2] = 16;
		number[3] = 17;
		
		for (int i=0; i< number.length;i++)
		{
			Sum = Sum+number[i];
			
			Avarage = Sum/number.length;	
		}
		
		System.out.println("Sum of the number is ->  " + Sum);
		System.out.println("Avarge is ->  "+ Avarage);

	}

}
