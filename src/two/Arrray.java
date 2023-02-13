package two;

import java.util.Arrays;

public class Arrray {

	public static void main(String[] args) {
	int[]a= {2,6,8,8,9,7,5,5,8,98,2,1};
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
           System.out.print(a[i]+",");
	}

}
