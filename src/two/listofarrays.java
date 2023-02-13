package two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class listofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list2= new ArrayList<Integer>(Arrays.asList(2,5,8,10,6,3,4));
		
		
		for(Integer e:list2) {
			System.out.println(e);
		}
		
	Iterator<Integer>h2=	list2.iterator();
	while(h2.hasNext()) {
		System.out.println(h2.next());
	}
			
		list2.removeIf(shail-> shail%2==1);
		
		System.out.println(list2);
		
		
		ArrayList<String> list= new ArrayList<String>(Arrays.asList("subhash","shailaja","Hogale"));
		
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList("subhash","shailaja","bhosale","hiii"));
		
		Collections.sort(list1);
		
//		list.removeAll(list1);
//		System.out.println(list);
		
		
		list1.removeAll(list);
		System.out.println(list1);
		list.retainAll(list1);
		System.out.println(list);

	}

}
