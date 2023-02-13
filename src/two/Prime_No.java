package two;

public class Prime_No
{

	public static void prime()
	{
		int no=11;
		int count=0;
		
		for(int i=2;i<no;i++)
	{
		if(no%i==0)	
		{
			count++;
			break;
		}
	}
		if(count==1)
		{
			System.out.println(" not prime no");
		}
		
		else {
			System.out.println("prime no");
		}
		
		
	}
		public static void main(String[] args)
	{
		 prime();

	}

}
