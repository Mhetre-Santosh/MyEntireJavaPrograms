 package StringFunctions;// Assignment 60 = program on DATE class with past,future and present time

import java.util.Date;

public class HowtoGetFutureTime {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println("Present Time "+d1);   // To get present time
		
		System.out.println("To get Epoch Time "+d1.getTime());  // Get the current epoch time
		
		Date d2 = new Date (d1.getTime()+(60*60*1000*24*5));  // To get the Future Time
		System.out.println("Future time "+d2);	
		
		Date d3 = new Date (d1.getTime()-(60*60*1000*24*5));  // To get the Past Time
		System.out.println("Past time "+d3);
		
	}
	

}
 