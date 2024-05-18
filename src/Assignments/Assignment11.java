package Assignments; // Assignment11 = Arithmetic Operation using Human input
import java.util.Scanner;
public class Assignment11 {
	
	static void add()
	{
		Scanner x = new Scanner (System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int sum = a + b;
		System.out.println("Add of a & b is =  " + sum);
		
	}
	
	static void sub()
	{
		Scanner x = new Scanner (System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int Sum = a - b;
		System.out.println("Sub of a & b is =  " +Sum);
		
	}
	
	static void mul()
	{
		Scanner x = new Scanner (System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int Sum = a * b;
		System.out.println("mul of a & b is =  " +Sum);
	
	}
	
	static void div()
	{
		Scanner x = new Scanner (System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int Sum = a / b;
		System.out.println("div of a & b is =  " +Sum);
		
	}
	
	static void mod()
	{
		Scanner x = new Scanner (System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int Sum = a % b;
		System.out.println("mod of a & b is =  " +Sum);
		
	}
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
