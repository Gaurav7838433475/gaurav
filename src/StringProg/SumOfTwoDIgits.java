package StringProg;

public class SumOfTwoDIgits {

	public static void main(String[] args) {
		
		String s="11b21c3";
		int sum=0;//0 11 32 
		int tsum=0;//0 1 11
		for(int i=0;i<s.length();i++)
		{			//i=0 0<7t
					//i=1 1<7t
					//i=2 2<7t
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;//1 1 2 1 3
				tsum=tsum*10+n;//0*10+1=1
								//1*10+1=11
								//0*10+2=2
								//2*10+2=22
								//0*10+3=3
			}
			else
			{
				sum=sum+tsum;//0+11=11
							//11+21=32
							//32+3=35
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}

}
