package chapter04;

import java.util.Date;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		
		Date d = new Date();
		d.getHours();
		
		
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		
		//Auto Boxing 자동으로 클래스를 만들어서 어떤 값을 객체로 래핑
		
		Integer j1 = 10;
		Integer j2 = 10;

		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));
		
		// Auto UnBoxing
		int m = j1.intValue() + 10;
		int m1 = j1 + 10;
		
		
	}

}
