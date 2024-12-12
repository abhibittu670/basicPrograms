package time;

import java.util.Date;

public class Presenttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date d1 = new Date(); 
       System.out.println(d1);
       System.out.println(d1.getTime());
       
       Date d2 = new Date(d1.getTime());
       System.out.println(d2);
       
       String input = d2.toString();
       
       String month = input.substring(4, 7);
       System.out.println(month);
       System.out.println(d2.getTime() + (1000*60*60*3));
       System.out.println(d2);
       System.out.println(d2.getTime() - (1000*60*60*24*6));
       System.out.println(d2);
	}
 
}
