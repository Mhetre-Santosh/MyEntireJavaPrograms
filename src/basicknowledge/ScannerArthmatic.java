package basicknowledge;

import java.util.Scanner;

public class ScannerArthmatic {

	public static void main(String[] args) 
	{
		Scanner x = new Scanner (System.in);
	
		int a =  x.nextInt();
		int b =  x.nextInt();
		
		int add = a + b;
		System.out.println("Addition of A & B is  " + add);
		
		int sub = a - b;
		System.out.println("Subtraction of A & B is  "+sub);
		
		int mul = a*b;
		System.out.println("multiplication of A & B is  "+mul);
		
		int div = a/b;
		System.out.println("Division of A & B is  "+div);
		
		int mod = a%b;
		System.out.println("Moduls of A & B is  "+mod);
		
		x.close();
	}

}
