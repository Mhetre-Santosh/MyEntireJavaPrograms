package Array;   // Assignment 62 = Create an array for Student,roll no,Gender 

public class StudentnameRollNoGender
{

	public static void main(String[] args) 
	{
		String[] names = new String[3];  // declare and initilise your array.
		
		names[0]="Yash";		
		names[1]="Maya";
		names[2]="Ansh";
		
		double[] Roll_number = new double[3];
		
		Roll_number[0] = 98;
		Roll_number[1] = 99;
		Roll_number[2] = 10;
		
		char[] Gender = new char[3];
		
		Gender[0] = 'M';
		Gender[1] = 'F';
		Gender[2] = 'M';		
		
		System.out.println("Student names   Roll Number   Gender");
		
		for (int i = 0; i<= 2 ; i++)
		{
			System.out.println(names[i]+ "              "+ Roll_number[i]+ "         "+ Gender[i]);
		}
		
		
	}

}
