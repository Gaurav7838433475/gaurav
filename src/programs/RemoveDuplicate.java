package programs;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int [] a= {2,4,1,1,5,4};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
		
	}

}
