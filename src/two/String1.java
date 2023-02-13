package two;

public class String1 {

	public static void main(String[] args)
	{
		
		string_rev();
		prime_no();
		 even_odd();
	}
	
	public static void string_rev()
	 {
		String str="shailaja";
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
	    }
		System.out.println(rev);
     }
	
	 public static void prime_no()
	 {
		 int no=17;
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
			System.out.println(" not prime");
		
		}
		else
		{
			System.out.println("prime");
		}
	 
	 }	 
	 public static void even_odd()
	 {
		 int no=14;
		 int count = 0;
		 
	 for(int i=2;i<no;i++)
	 {
		 if(no%2==0)
		 {
			 count++;
		 break; 
	     }
	 }
		 if(count==1)
		 {
			 System.out.println("even");
		 }
		 else
		 {
			System.out.println("odd"); 
		 }
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}