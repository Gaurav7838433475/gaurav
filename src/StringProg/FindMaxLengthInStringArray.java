package StringProg;

public class FindMaxLengthInStringArray {

	public static void main(String[] args) {
		
		String [] s= {"abcdef","avbc","qfq","ab","ewree","hdhdhd"};
		String maxlength=s[0];
		for(int i=0;i<s.length;i++)
		{
				if(s[i].length()>maxlength.length())
				{
					maxlength=s[i];
				}
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==maxlength.length())
			{
				System.out.println(s[i]+" having maximun length = "+s[i].length());
			}
		}
	}


	}


