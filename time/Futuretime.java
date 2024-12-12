package time;

import java.util.Date;

public class Futuretime {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
        //current time
		Date t1 = new Date();
		System.out.println(t1);
		System.out.println(t1.getTime());
		// Future time
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 1));
		System.out.println(d2);
		// past time
		Date d3 = new Date();
		Date d4 = new Date(d3.getTime() - (1000 * 60 * 60 * 24 * 1));
		System.out.println(d4);
	}

}
