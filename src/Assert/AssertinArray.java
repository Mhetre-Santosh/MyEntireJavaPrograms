package Assert;
                                         // Assignment = 95
public class AssertinArray
{

	public static void main(String[] args) 
	{
	
		        int[] arr = {1, 2, 3, 4, 5};
		        int index = 4;
		        assert index >= 0 && index < arr.length : "Index out of bounds";
		        int element = arr[index];
		        System.out.println("Element at index " + index + ": " + element);
		
		
	/*	int number[] = new int[4];
		
		number[0] = 100;
		number[1] = 20;
		number[2] = 110;
		number[3] = 10;
		
		//assert number[a] == 10:"The 10 is not Present in Array";
		int i;
		for ( i = 0; i <4;i++)
		{
			System.out.println(number[i]);
			
		}
		
		assert number[i] == 10:"The 10 is not Present in Array"; */

	}

}
