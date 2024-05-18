package AccessSpecifier2;

import AccessSpecifier1.Santosh;

public class Manish2 {

	public static void main(String[] args)
	{ 
		Santosh x = new Santosh ();   // crating object of Santosh class.
		
		x.add();  // only public access specifier is accessible.
	}

}
