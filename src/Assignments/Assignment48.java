package Assignments;  // Assignment48 =  Declare and initialize 
                                       // the Global variable and access then in main method by updating values , 
                                       //also by accessing default values

public class Assignment48 {

	String name1 = "Ansh"; // non static Global variable, 
	static int age =43; // Global variable,                  Note - it is required declared and initialize in single line.
	static String name = "Shubhangi";  // Global variable
	
	static void add()
	{
		int a = 100; // local variable scope is inside the this method.
		System.out.println( a );   // Utilized local variable, we can not use directly local variable.
		
	}
	
	void variable ()
	{
		int a;                  // declared                 Note- local variable Not required declared and initialize in single line.
		a = 1000;                // Initialized
		System.out.println(a);  //  utilized
	}

	public static void main(String[] args) 
	{
		System.out.println(name);
		name = "Santosh";  // updating the value of global variable
		System.out.println(name);
		System.out.println( age );
		add();
		
		Assignment48 x = new Assignment48 ();  // object of class for both non static method and non static global variable.
		x.variable();	
		System.out.println(x.name1);  // to call  non static Global variable, 
		
	}
}
