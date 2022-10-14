package StringProg;

import java.util.LinkedHashSet;

public class AllInOne {

	public static void main(String[] args) {
		
		int [] a= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);

		for(int n:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
				count++;
				}
			}
			System.out.println(n+" is occured: "+count);
			
			if(count>1)
			{
				System.out.println(n+" = is repeating "+count+" time");
			}
			
			if(count==1)
			{
				System.out.println(n+" = is unique occured only once ");
			}
		}
		
		

	}
	
}
