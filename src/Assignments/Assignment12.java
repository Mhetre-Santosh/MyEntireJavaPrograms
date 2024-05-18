package Assignments;  // Assignment12  Declare and utilize all methods of Scanner class with the help of static method
import java.util.Scanner;
public class Assignment12 {
	static void next(){
		Scanner x = new Scanner (System.in);
		
		System.out.println("Give the int value =");
		int a =  x.nextInt();
		System.out.println("int value o/p "+a);
		
		System.out.println("Give the byte value =");
		byte b = x.nextByte();
		System.out.println("byte value o/p "+b);
		
		System.out.println("Give the short value =");
		short c = x.nextShort();
		System.out.println("short value o/p"+c);
		
		System.out.println("Give the long value =");
		long d = x.nextLong();
		System.out.println("long value o/p "+d);
		
		System.out.println("Give the boolean value =");
		boolean e = x.nextBoolean();
		System.out.println("boolean value o/p "+e);
		
		System.out.println("Give the String value =");
		String s = x.next();
		System.out.println("String value o/p "+s);
		
		System.out.println("Give the float value =");
		float f = x.nextFloat();
		System.out.println("float value o/p "+f);
		
		System.out.println("Give the double value =");
		double g = x.nextDouble();
		System.out.println("double value o/p "+g);
		
		x.close();
	}
	public static void main(String[] args) 
	{
			next();
	}

}
