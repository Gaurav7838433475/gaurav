package programs;

import java.util.Arrays;

public class LinearElementSearch {

	public static void main(String[] args) {
		
		int [] a= {7,5,9,4,3,8,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/*int search_ele=3;
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Element is found");
			}
		}*/
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println(Arrays.binarySearch(a,9));

	}

}
