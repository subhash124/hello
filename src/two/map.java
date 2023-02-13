package two;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="subhash";
		char[] x = str.toCharArray();
		int size = x.length;
	//	Map<Character,Integer>map=new LinkedHashMap<>();
	//	Map<Character,Integer>map=new TreeMap<>();
		Map<Character,Integer>map=new HashMap<>();
		
		int i=0;
		while(i!=size) {
			if(map.containsKey(x[i])==false)
					{
				map.put(x[i], 1);
				
			}
			else {
				Integer old = map.get(x[i]);
				int new1 = old+1;
				map.put(x[i], new1);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>>lmap=map.entrySet();
		
		for(Map.Entry<Character, Integer>data1:lmap) {
			if(data1.getValue()>=1) {
				System.out.print(data1.getKey());
				System.out.println(data1.getValue());
			}
		}
		
		

	}

}
