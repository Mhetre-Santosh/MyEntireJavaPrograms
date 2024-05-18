package Assignments;  // Assignment 5 = Constructor overloading  program at least one constructor have  seven parameters in it.
public class Assignment5 {
	
	 Assignment5 ()
	 {
		 System.out.println("0 parameter");
	 }
	 
	 Assignment5 (int a)
	 {
		 System.out.println("1 parameter");
	 }
	 
	 Assignment5 (int a, double b, char c, String d, float e, boolean f, long g)
	 {
		 System.out.println("7 parameter");
	 }
	public static void main(String[] args) 
	{
		new Assignment5 ();
		new Assignment5(32000);
		new Assignment5(20000,50.53,'a',"Santosh",40.12f,true,500000);
	}
}
