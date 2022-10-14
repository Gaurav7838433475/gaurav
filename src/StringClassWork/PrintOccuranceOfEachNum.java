package StringClassWork;

import java.util.LinkedHashSet;

public class PrintOccuranceOfEachNum {

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
			
	}

	}}
