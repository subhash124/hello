package three;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_Automation 
{
        @Test(enabled=false)
    	public void m1()
	    {
        	
        System.out.println("DATA 1");
        
	    }
        
        @Test(priority=2)
        public void m2()
    	{
        	Assert.assertEquals(true, false);
            System.out.println("DATA 2");
    	}
        
        @Test
        public void m3()
    	{
            System.out.println("DATA 3");
    	}
        
        @Test(dependsOnMethods= {"m1"})
        public void m4()
    	{
        
            System.out.println("DATA 4");
    	}
        
        @Test
        public void m5()
    	{
            System.out.println("DATA 5");
    	}
    	
}
