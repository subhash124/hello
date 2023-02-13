package two;

public class practice
{
	public static void greaterNo()
	{
		 int a=5;
		 int b=6;
	 if(a>b)
		 
	 {
		 System.out.println("a is greater");
	 }
	 else	
			
	 {
		 System.out.println("b is greater");
	 }
	 
	}
	
	public static void checking()
	{
		 int a=50;
		 int b=60;
		 int c=70;
	 if(a>b)
		 
	 {
		 System.out.println("a is greater than b");
	 }
	 else if(b>c)	
			
	 {
		 System.out.println("b is greater than c");
	 }
	
	 else if(a>c)	
			
	 {
		 System.out.println("a is greater than c");
	 }
	
	 else 	
			
	 {
		 System.out.println("c is greater");
	 }
		
	 }
	
	public static void eualityOFtwoNumbers()
	{
		int a=4;
		int b=5;
		
		if(a==b)
			 
		 {
			 System.out.println("both are equal");
		 }
		 else	
				
		 {
			 System.out.println(" not equal");
		 }
		
	}
	
	
	public static void eualityOFThreeNumbers()
	{
		int a=86;
		int b=13;
		int c=64;
		if(a==b && b==c && a==c)
			 
		 {
			 System.out.println("No's are equal");
		 }
		 else	
				
		 {
			 System.out.println(" No's are not equal");
		 }
		
	}
	
	public static void finding()
	{
		 int a=30;
	 while(a<=40)
		 
	 {
		 System.out.println(a );
		 a++;
	 }
	 
	
	}
	
	public static void table()
	{
		 int a=1;
		 int b=5;
	 while(a<=10)
		 
	 {
		 System.out.println(a*b );
		 a++;
	 }
	 
	
	}
	
	public static void array()
	{
		int[] a=new int [5];
			a[0]=10;	
			a[1]=20;	
			a[2]=30;	
			a[3]=40;	
			a[4]=50;	
			 
			int sum=0;
			int len=a.length;
			for(int i=0; i<len; i++)
			{
				sum=sum+a[i];
			}
	System.out.println(sum);
	}
	
	public static void even()
	{
		 
		int num=100;

		if(num%2==0)
			 
		 {
			 System.out.println("num is even");
		 }
		 else	
				
		 {
			 System.out.println(" num is odd");
		 }
	}
	
	public static void comparison()
	{
		 
		int age=20;
        int weight=40;
        
		if(age>=18) 
		 {
			 if(weight>=50)
			 {
			 System.out.println("person  is eliglible to donate blood");
		     }
		
		     else		
		     {
			  System.out.println(" person is not eliglible to donate blood due to weight");
		     }
		 } 
		 else		
		 {
			 System.out.println(" person is not eliglible to donate blood due to age");
		 }
	}
	
	public static void fibonacciSeries()
	{
	int k=0;
	int a=1;
	int b=1;
	 
	while(k<60)
	{
		k=a+b;
		a=b;
		b=k;
		System.out.println(k);
		
	}
		
	}
	
	public static void swapping()
	{
		int a=30;
		int b=60;
		
		  a=a+b;                  //a=30+60=90
		  
		  b=a-b;                 //b=90-60=30
		  
		  a=a-b;                //a=90-30=60
		  
		  System.out.println("a="+a);
		  
		  System.out.println("b="+b);
	}
	
	public static void stringReverse1() 
	{
	String str="shailaja khandekar";
	String rev=" ";
	for(int i=str.length()-1;i>=0;i--) 
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
	}
	
	public static void stringReverse2()
	{
		String str="I Love My India";
		char[] v=str.toCharArray();
		
		for(int i=v.length-1;i>=0;i--)
		{
			System.out.print(v[i]);
		}
		System.out.println(" ");
		
		
	}
	
	public static void stringReverse3()
	{
		String name="I Love My India" ;
		String a[]=name.split("  ");                          //USING ARRAY
		
		for(String word:a)
		{
			System.out.println(word);
		}
		
	}
	
	public static void stringReverse4()
	{
		String name="asdfasdfasdfasf" ;
		String a[]=name.split("a");                          //USING ARRAY
		
		for(String word:a)
		{
			System.out.println(word);
		}
		
	}
	
	public static void stringArray()
	{
		//input string
		String str="shailaja" ;
		
		
		//creating array of string length
		//using length() method
		char [] ch=new char[str.length()] ;                     
		
		//copying char by char into array
		// using for each loop
		
		for(int i=0; i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		// printing the elements of array
		//using for each loop
		for(char c:ch)
		{
			System.out.println(c);
		}
		
	}
	public static void main(String[] args)
	{
//		  greaterNo();
//		  eualityOFtwoNumbers();
//		  checking();
//		  eualityOFThreeNumbers();
//		  finding();
//		  table();
//		  array();
//        even();
//		  comparison();
//		 fibonacciSeries();
//		 swapping();
//		stringReverse1();
//       stringReverse2();
//		stringReverse3();
//		stringReverse4();
		stringArray();
	}
	
    }



