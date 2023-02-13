package three;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Hashmap
{

	public static void main(String[] args) {
	
		String str="subhash dnyanoba";
		//str=str.replace(" ", "");
		 char[ ] y = str.toCharArray();
	    int size = y.length;
	    int i=0;
	    
	 //   Map<Character,Integer>map=new HashMap<>();
	  //  Map<Character,Integer>map=new TreeMap<>();
	      Map<Character,Integer>map=new LinkedHashMap<>();
	    while(i!=size) {
	    if(map.containsKey(y[i])==false) 
	    {
	    	map.put(y[i], 1);
	    }
	    else
	    {
	    	Integer oldval = map.get(y[i]);
	    	int newval = oldval+1;
	    	map.put(y[i], newval);
	    }
	    i++;
	    

	}
	    Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
	    for(Map.Entry<Character, Integer>data:hmap)
	    {
	    	 if(data.getValue()!=0)
	    //  if(data.getValue()>=1)
	    //	if(data.getValue()>1)
	    //	if(data.getValue()==1) 
	    	{
	    		System.out.print(data.getKey()+" ");
	    		System.out.println(data.getValue());
	    	}
	    }
	    
}
}
