package SuperCallingStatement;

class Ram
{
	Ram (int a, int b)
	{
		System.out.println("Grand Parent");
	}
}

class Sham extends Ram
{ 
	Sham (int a)
	{
		super(10,100);    // it is always present no mater written or not
		System.out.println("Parent"); 
	}
	
}

public class pscs extends Sham
{
	pscs()
	{
		 super(100);
		 System.out.println("child");
	}
	public static void main(String[] args) 
	{
		new pscs();
	}

}
