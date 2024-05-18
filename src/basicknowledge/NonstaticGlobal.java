package basicknowledge;

public class NonstaticGlobal {
	
	String name = "Ansh";

	public static void main(String[] args) 
	{
		NonstaticGlobal x = new NonstaticGlobal ();
		System.out.println(x.name);
		
	}

}
