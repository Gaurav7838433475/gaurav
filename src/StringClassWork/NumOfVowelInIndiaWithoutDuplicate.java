package StringClassWork;

import java.util.LinkedHashSet;

public class NumOfVowelInIndiaWithoutDuplicate {

	public static void main(String[] args)
	
	{
		String str="indiaaaaaaaaaaaaaaauoo";
		int count=0;
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		
		for(char c: set)
		{
		
			if(c=='a'|| c=='e' ||c=='i' || c=='o' || c=='u')
			{
				count++;
				System.out.print(c);
			}
		}
		System.out.println(" "+count);

	}

}
