package StringProg;

import java.util.LinkedHashSet;

public class PositionOfString {

	public static void main(String[] args) {
		
		String st="I love I love Bglr City";
		String[] s=st.split(" ");

		LinkedHashSet<String> set=new LinkedHashSet<>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String str:set)
		{
			for(int i=0;i<s.length;i++)
			{
				if(str.equals(s[i]))
				{
					System.out.println(str+" is present in "+(i+1)+" position ");
					break;
				}
			}
		}
	}

}
