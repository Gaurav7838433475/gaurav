package StringClassWork;

public class NumOfVowelInIndiaWithDuplicate {

	public static void main(String[] args) {
		
		String str="india";
		char[] s = str.toCharArray();
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
			{
				count++;
				System.out.print(s[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println("Number of vowel present in india with duplicate is: "+count);
	}

}
