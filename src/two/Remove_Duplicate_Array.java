package two;

import java.util.Arrays;

public class Remove_Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {1,2,5,2,2,3,6,5,2,1,23,2,4,6,4};
		
		Arrays.sort(a);
		
		int j=0;
		
		for(int i=0; i<a.length-1; i++) {
			
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		a[j++]=a[a.length-1];
		
		for(int i=0; i<j; i++) {
			System.out.print(a[i]+",");
		}

	}

}
