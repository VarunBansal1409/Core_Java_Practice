package com.enumeration;

enum Weeks {
	SUN, MON, TUE, WED, THU, FRI, SAT
}
public class Demo {

	public static void main(String[] args) {

		Weeks w1 = Weeks.SUN;
		System.out.println(w1);
		Weeks w2 = Weeks.MON;
		System.out.println(w2);
		Weeks w3 = Weeks.TUE;
		System.out.println(w3);
		
		Weeks[] d = Weeks.values();
		for(Weeks res : d)
		{
			System.out.println(res +" ----> " +res.ordinal());
		}

	}

}
