package Array;   // ArrayIndexOutOfBoundsException

public class ArrayException 
{

	public static void main(String[] args)
	{
		String[] name = new String[3];
		
		name[0]= "jyothi";
		name[1]= "Nitin";
		name[2]= "Shaik";
		name[3]= "Raghu";
		
		for (int i = 0; i <4; i++)
		{
			System.out.println(name[i]);
		}

	}

}
