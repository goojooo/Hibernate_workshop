package itp;

import java.util.Date;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("java.util.Date");
		System.out.println("----------------------------------------");
		System.out.println("data of class obj : " + clazz);
		
		System.out.println("----------------------------------------");
		
		Class cls2 = Date.class;			// Industry standard
		System.out.println("data of cls obj : " + cls2);
		System.out.println("----------------------------------------");
		

	}

}
