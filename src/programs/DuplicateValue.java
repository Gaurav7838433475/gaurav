package programs;

import java.util.HashSet;

public class DuplicateValue {

	public static void main(String[] args) {
			
		String arr[]= {"java","selenium","c","c#","java","selenium"};
		HashSet<String> set=new HashSet<String>();
		
		boolean flag=false;
		
		for(String s:arr)
		{
			if(set.add(s)==false)
			{
				System.out.println("Found duplicate element is : "+s);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not present");
		}
	}

}
