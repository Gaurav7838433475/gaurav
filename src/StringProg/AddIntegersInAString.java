package StringProg;

public class AddIntegersInAString 
	{
	public static void main(String[] args)
	{
		String s="b10c3d9";
		int sum=0;
		char[] str = s.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='0' && str[i]<='9')
			{
				sum=sum+(str[i]-48);
			}
		}
		System.out.println("sum of digits in string is: "+sum);
		
	}

}
