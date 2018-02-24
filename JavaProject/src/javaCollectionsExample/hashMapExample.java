package javaCollectionsExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {

		//It places the value in key value pair
		//It accepts duplicate values
		//It overwrites any key value with another value with same key
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//here add method is not present
		hm.put(0,"Ravi");
		hm.put(1, "Lavina ");
		hm.put(0,"Agrawal");
		hm.put(2,"Agrawal");
		hm.put(100,"Amit"	);
		hm.put(40,"he");
		/*System.out.println(hm);
		System.out.println(hm.get(2));
		hm.remove(2);*/
		System.out.println(hm);
		
		//To get the key value pair separatley we first change it to Set to iterate on it with Iterator
		//Then once we have all the values in a set,we iterate like before and instead of printing i.next
		//we again have to change it to Map and then print its key value
		Set sn=hm.entrySet();
		
		Iterator i=sn.iterator();
		
		while(i.hasNext()){
	//If you do i.next here it will give error as its stored as both key and value and cannot determine what to retrieve
	//Hence change it to Map again and then use getkey and getvalue
		/*System.out.println(i.next());	*/
		Map.Entry mp = (Map.Entry)i.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		
		
		}
		
		
		
		
		
	}

}
