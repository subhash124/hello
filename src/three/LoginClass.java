package three;

import java.util.Scanner;

public class LoginClass implements LoginPage
{
   String name;
   String pass;
 
         public void input() 
         
       {
        	
	Scanner ref=new Scanner(System.in);
	System.out.println("Enter your name: ");
	name=ref.nextLine();
	
	System.out.println("Enter your password: ");
	pass=ref.nextLine();
	
       }

        public void output()
        
        {
        	
	System.out.println("Login Successfully");
	
        }
	
	public static void main(String[] args) 
	{
		LoginClass obj=new LoginClass();
		obj.input();
		obj.output();
		

	}

	
	
}
