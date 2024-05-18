package basicknowledge; // Assignment 25 = Program to demonstrate LOCAL VARIABLE concept

public class variable_practice {
	
	String name = "ansh";
	int age = 19;
	double weight= 90.87;
	
	void add(String name, int age, double weight)
	{
		System.out.println("hey my bio data is " + name + age + weight);
	}

	public static void main(String[] args)
	{
		variable_practice x = new variable_practice ();
		System.out.println(x.name);
		System.out.println(x.age);
		x.add("Shubhangi", 25 , 40.50); 
	}

}
