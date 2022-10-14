package javaprog;

import java.util.LinkedHashSet;

public class Linkhashsetprog {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		 set.add(10);
		 set.add(20);
		 set.add("hello");
		 set.add("hello");
		 set.add(30);
		 set.add(null);
		 set.add(null);
		 set.add(10.5);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));
		System.out.println(set.size());
		if(set.contains("hi"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		System.out.println();
		for(Object obj:set)//using for each loop fetching databn 
		{
			System.out.println(obj);
		}
	}

}
