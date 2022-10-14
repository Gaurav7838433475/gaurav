package programs;

public class OppendDigits {

	public static void main(String[] args) {
		
		int a[]= {4,8,0,9,0,7,0,5,0};//append zeros at the end
		int temp[]=new int[a.length];
		int m=0;
		int n=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp[n]=a[i];
				n--;
			}
			else
			{
				temp[m]=a[i];
				m++;
			}
		}
		for(int j=0;j<a.length;j++)
		{
		System.out.print(temp[j]+" ");
		}
	}

}
