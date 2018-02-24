package javaCollectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
	
	public static void main(String[] args) {
		

		//HashSet,TreeSet,LinkedHashSet implements Set interface
		//does not accept duplicate values
		//There is no gurantee elements are  stored in sequential order.They are stored in random order
		
		HashSet<String> hs =new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		//There is no function in hashset related to index as there is no spcific order in which elements rae stored
		
		hs.add("USA");//will not accept duplicate values
		hs.add("uk");
		hs.add("France");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove("France");
		System.out.println(hs);
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}
	
	

	
}
