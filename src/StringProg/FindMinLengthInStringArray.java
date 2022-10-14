package StringProg;

public class FindMinLengthInStringArray {

	public static void main(String[] args) {
		
		String [] s= {"36525211","4587","524","14","14256"};
		String minlength=s[0];
		for(int i=0;i<s.length;i++)
		{
				if(s[i].length()<minlength.length())
				{
					minlength=s[i];
				}
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==minlength.length())
			{
				System.out.println(s[i]+" having minimun length = "+s[i].length());
			}
		}
	}

}
