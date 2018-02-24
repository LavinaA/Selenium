package javaCollectionsExample;

import java.util.ArrayList;

public class ArrayListExample {
	
	//ArayList,LinkedList and vector implemets List interface
	//All of the above accept duplicate values
	//Set interface does not accept duplicate values
	//Aray has fixed size whereas Arraylist grows dynamically
	//you can access and insert anby value at any index.

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Lavina");
		a.add(0,"Agrawal");
		a.add("Agrawal");//List Will accept duplicate values as well 
		a.add("ravi");
		a.remove("ravi");
		a.add("Amit");
		a.add(2, "Raju");
		System.out.println(a);
		System.out.println(a.contains("Raju"));
		System.out.println(a.indexOf("Raju"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
