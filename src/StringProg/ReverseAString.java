package StringProg;

public class ReverseAString {

	public static void main(String[] args) {

		//String s="welcome";
		
		/*for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}*/
		
		/*String st="welcome";
		char[]s=st.toCharArray();
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}*/

		/*String s="welcome";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		/*String st="welcome";
		char[]s=st.toCharArray();
		int count=0;
		for(char c:s)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}*/
		
		/*String s="welcome";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);*/
		
		/*String s="welcome";
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());*/
		
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}
	}

}
