package StringProg;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharInAString {

	public static void main(String[] args) {
		
		String s="tester";
		/*for(int i=0;i<s.length();i++)
			//i=0 0<6 T
			//i=1 1<6 T
			//i=2 2<6 T
			//i=3 3<6 T
			//i=4 4<6 T
			//i=5 5<6 T
			//i=6 6<6 F
		{
			System.out.println(s.charAt(i));
		}*/
		/*HashSet<Character> set = new HashSet<Character>();
			for(int i=0;i<s.length();i++)
			{
				set.add(s.charAt(i));
			}
			for(Character ch:set)
			{
				System.out.print(ch);
			}*/
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.print(ch);
		}
	}

}
