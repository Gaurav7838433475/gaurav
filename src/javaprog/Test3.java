package javaprog;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		
		Vector<Object> vec=new Vector<Object>();
		vec.add(10);
		vec.add(20);
		vec.add(10);
		vec.add("Hi");
		vec.add(null);
		vec.add(null);
		System.out.println(vec);
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.indexOf("Hi"));
		vec.add(4,"hello");
		System.out.println(vec);
	}

}
