package two;

public class Programming
{

	
	public static void reverse_Number()
	{
		int num=123, i, rev=0, rem;
		
		for(i=num;i!=0;i=i/10)                    //i=123; 123!=0; 123/10=12  12/10=1
		{
			rem=i%10;                             //123%10=3         12%10=2    1%10=1
			
			rev=rev*10+rem;                       //0*10+3=3      3*10+2=32   32*10+1=321
					
		}
	
		System.out.println("The reverse of a given num is" +rev);
		
	}
	
	public static void reverse_Number1()
	{
		int num=123456789, i, rev=0,rem;
		for(i=num;i!=0;i=i/10)             // i=123456789 ;123456789!=0; 123456789/10=12345678 12345678/1=1234567 1234567/10=123456 123456/10=12345
		{
			rem=i%10;                      //123466789%10=9               12345678%10=8          1234567%10=7      123456%10=6        12345%10=5
			
			rev=rev*10+rem;                //0*10+9=9                      9*10+8=98               98*10+7=987       987*10+6=9876   9876*10+5=98765
		}
		System.out.println(rev);
	}
	
	
	public static void palindrome_Number()
	{
		int num=5454545, i, rev=0,rem;
		for(i=num;i!=0;i=i/10)         
		{
			rem=i%10;                                   
			rev=rev*10+rem;
		}
		if(num==rev) 
		{
			System.out.println("Given Number is palindrome num" );
		}
		else
		{
			System.out.println("Given Number is not  palindrome num");
		}
	}
	
	public static void armStrong_Number()
	{
		int num=153, i, rem, arm_num=0;
		
		for(i=num; i!=0; i=i/10)                    //i=153               153/10=15            15/10=1
		{
		rem=i%10;                                //rem=153%10=3         rem=15%10=5          1%10=1
		
		arm_num=arm_num+rem*rem*rem;         //arm_num=0+3*3*3=27         27+5*5*5=152         152+1*1*1=153
		
		}
		if(num==arm_num)
		{
			System.out.println("The  Given number is ArmStrong num");
		}
		
		else
		{
			System.out.println(" The  Given number is  not ArmStrong num");
		}
		 
	}
	
	public static void armStrong_Number1()
	{
		int num=371, i, rem, arm_num=0;
		
		for(i=num; i!=0; i=i/10)
		{
			rem=i%10;
			
			arm_num=arm_num+rem*rem*rem;
		}
	
		if(num==arm_num)
		{
			System.out.println( " ArmStrong Number " );
		}
		
		else
		{
			System.out.println(" Not ArmStrong Number" );
		}
	}
	
	public static void upperCase_String()
	{
		String name="Shailaja";
		name=name.toUpperCase();
		
		System.out.println(name);
		
		name=name.toLowerCase();
		
		System.out.println(name);
		
	}
	
	public static void concat()
	{
		String str1="Shailaja";
		String str2="Khandekar";
		
		System.out.println(str1.concat(str2));
				
	}
	
	public static void remove_White_Space()
	{
		String name="Remove White Space";
		
		name=name.replace(" ", "");
		
		System.out.println(name);
	}
	
	public static void replace()
	{
		String name="Remove White Space";
		
		name=name.replace('e', 'a');
		
		System.out.println(name);
	}
	
	
	public static void find_Out_Duplicate()
	{
		
		
		
	}
	
	public static void vowels_Consonent()
	{
		int vCount=0;
		int cCount=0;
		
		String str="I Love My India";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
			{
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			{
				cCount++;
			}
		}
		System.out.println( "Number of Vowels"    +vCount );
		System.out.println( "Number of Consonent" +cCount );
	}
	
	public static void array()
	{
		int[] arr=new int[] {2,3,6,5,2,1,3,4,6};                   //FINDING DUPLICATES
		
		for(int i=0; i<arr.length;i++)
		{                                   
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
	
	
	public static void main(String[] args)  
{
		
//		 reverse_Number();
//		 reverse_Number1();
//		 palindrome_Number();
//		 armStrong_Number()	;	
//		 armStrong_Number1();
//		 upperCase_String();
//		 concat();
//		 remove_White_Space();
//		 replace();
//		 vowels_Consonent();
//		 array();
}

}
