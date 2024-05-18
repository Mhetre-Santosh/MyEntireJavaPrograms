package StringFunctions;

import java.util.Date;

public class HowtoGetPastTime {

	public static void main(String[] args) {
		
		Date d1 = new Date ();   // to get current time
		System.out.println(d1);

		Date d3 = new Date (d1.getTime()-(60*60*1000*24*5));  // To get the Future Time
		System.out.println(d3);

	}

}
