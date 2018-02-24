package javaCollectionsExample;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

//Both HashMap and HashTbale are same except that the difference lies in
//Synchronization,Null keys and Null values,Iterrating the values
//We iterate on Hashtable using Enumerator
public class hashTableExample {

	public static void main(String[] args) {

		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		//here add method is not present
		ht.put(0,"Ravi");
		ht.put(1, "Lavina ");
		ht.put(0,"Agrawal");
		ht.put(2,"Agrawal");
		ht.put(100,"Amit"	);
		ht.put(40,"he");
		System.out.println(ht);
		
		Enumeration<Integer> e=ht.keys();
		
		while(e.hasMoreElements()){
			
			Integer key=e.nextElement();
			String str=ht.get(key);
			
			System.out.println("The string for key " +key + " is " +str);
		}
		
		
		
		
		
		
	}

}
