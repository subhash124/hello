package three;

import java.util.Arrays;

public class All_Prpgram_Practice 
 {
	public static void main(String[] args)
	{
		int [] a= {2,3,6,1,2,5,4,3,7};
		Arrays.sort(a);
		int j=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
				
			}
		}
		a[j++]=a[a.length-1];
		for(int i=0;i<j;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	
 }
