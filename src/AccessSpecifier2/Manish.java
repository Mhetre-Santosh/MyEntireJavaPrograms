package AccessSpecifier2;

import AccessSpecifier1.Santosh;

public class Manish extends Santosh   // by becoming sub class  means use extend word here
{

	public static void main(String[] args)
	{
		Manish x = new Manish();   // creating the object of child class here.
		
		x.add();  // only private accessible
		x.mul();  // only protected accessible
	}

}
