package Assert;

public class AssertAddition 
{

	static void add (int a, int b)
	{
		assert a == 100:"the value of a not 100";
		int sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		add(10,200);
	}

}
