package two;

import java.util.Arrays;

public class Arrays_Sort 
{
	public static void sort()
	{
		
	int[]no= {68,97,38,-94,37,-173};
	Arrays.sort(no);
	
	for(int n:no)
	{
		System.out.print(n+ ",") ;
	}
	
	}
	public static void main(String[] args) 
	{
		sort();

	}

}
