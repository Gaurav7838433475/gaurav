package StringClassWork;

public class SegregateNumbersAlphabetsAndCharacter {

	public static void main(String[] args) {
	
		String str="a$#isv%2";
		char[] s = str.toCharArray();
		for(int i=0;i<s.length;i++)
		{
			for(char j='a';j<'z';j++)
			{
				if(s[i]==j)
				{
					System.out.print(s[i]);
				}
				
			}
			
			for(char k='0';k<='9';k++)
			{
				if(s[i]==k)
				{
					System.out.print(s[i]);
				}
			}
			
			for(char d:s)
			{
				if(d=='!' || d=='@' || d=='#' || d=='$' || d=='%' || d=='^' || d=='&' || d=='*' || d=='(' || d==')')
				{
					System.out.print(d);
				}
			}
			
		}
	}

}
