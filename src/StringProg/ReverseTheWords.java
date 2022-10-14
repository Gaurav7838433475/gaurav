package StringProg;

public class ReverseTheWords {

	public static void main(String[] args) {
		
	//	String st="I love Bangalore";//Bangalore love I
		/*String []s=st.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			//System.out.print(s[i]);
			//System.out.println();
			System.out.print(s[i]+" ");
		}*/
		
		/*String rev="";
		for(int i=0;i<st.length();i++)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);*/
		
		
		String st="I love Bangalore city";
		String []str=st.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String s=str[i];
			for(int j=s.length()-1;j>=0;j--)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
