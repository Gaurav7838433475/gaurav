package generalProgram;

public class PrintPrimeNoInAarray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		for(int i=1;i<a.length;i++)
		{
			int n=a[i];
			int j=2;
			while(j<=n)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(j==n)
			{
				System.out.print(n+" ");
			}
		

		}}}


