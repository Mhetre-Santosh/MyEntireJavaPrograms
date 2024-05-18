package MethodOveriding;   // Assignment 30 = Program to demonstrate SUPER KEYWORD

class parent 
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}

public class child extends parent
{
	 void login()
	{
		System.out.println("Login with email id");
		super.login();                                // super keyword
	}

	public static void main(String[] args)
	{
		
		child x = new child();
		x.login();
				
	}

}
