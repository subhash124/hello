package two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_duplicate_remove 
{

	public static void main(String[] args)
	{
		
	ArrayList<Integer> b= new ArrayList<Integer>(Arrays.asList(2,3,3,5,6,6) );
	List<Integer> unique = b.stream().distinct().collect(Collectors.toList());
	System.out.println(unique);

	}

}
