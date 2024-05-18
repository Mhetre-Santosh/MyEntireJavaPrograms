// Assignment 88 = Program to find the average of values of two arrays – one int array of size 4 and one double array of size 4.
package StringAndArrayProblems;

public class AverageValueofTwoArray {
	
	static int sum = 0;
	static int Avarage=0;
	static double sum1 = 0;
	static double Avarage1=0;
	public static void main(String[] args) {
		
		int number[] = new int[4];
		
		number[0] = 14;
		number[1] = 15;
		number[2] = 16;
		number[3] = 17;
		
		for(int i = 0; i <number.length; i++)
		{
			sum = sum + number[i];
			Avarage = sum/number.length;	
		}
		
		System.out.println(sum);
		System.out.println("Avarge of int->  "+ Avarage);
		
		double number1 []= new double[4];
				
		number1 [0] = 10.15;
		number1 [1] = 20.20;
		number1 [2] = 10.15;
		number1 [3] = 50.15;
		
		for(int i = 0; i <number1.length; i++)
		{
			sum1 = sum1 + number1[i];
			Avarage1 = sum1/number1.length;
		}
		
		System.out.println(sum1);
		System.out.println("Avarge of double ->  "+ Avarage1);
		
		System.out.println("Total Avg. ->  "+(Avarage + Avarage1)/2);
		

	}

}
