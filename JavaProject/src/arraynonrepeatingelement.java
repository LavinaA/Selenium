import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//Find first non repeating element of array
//Find first repeating element of array


public class arraynonrepeatingelement {

	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,4,3,10,1};
		//  Key Value
		//	1	1
		//	2	1
		//	3	3
		// 	4	2
		//	5	1
		// 10 	1
		
/*Since we want the "first" non repeating element which means the insertion order should be maintained and hence we use 
the LinkedHashmap as the inseration order will be maintained and we can use number as keys and their count as values*/

		LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			int temp;
			temp=arr[i];

			if(map.get(temp)== null){	//
				map.put(temp,1);

			}else{
				int value =map.get(temp);//This will give the value
				value++;
				map.put(temp, value);
			}
		}
		//Printing entire Map
			for(Map.Entry<Integer,Integer> entry:map.entrySet()){
				System.out.print("Key " +entry.getKey());
				System.out.print(" Value " +entry.getValue());
				System.out.println();

			}
			
			//Printing first non repeating element
			for(Map.Entry<Integer,Integer> entry:map.entrySet()){
				if(entry.getValue()==1){
					System.out.println("First non repeating element is " +entry.getKey());
					break;
				}
			}
			//Printing first repeating element
			for(Map.Entry<Integer,Integer> entry:map.entrySet()){
				if(entry.getValue()>1){
					System.out.println("First repeating element is " +entry.getKey());
					break;
				}
			}
			//Putting repeating and non rpeating elments in separate arrays
			List<Integer> l1=new ArrayList<>();
			List<Integer> l2=new ArrayList<>();
			
			for(Map.Entry<Integer,Integer> entry:map.entrySet()){
				if(entry.getValue()>1){ //putting repeating elements in array
					l1.add(entry.getKey());
				}else {
					l2.add(entry.getKey());
				}
			}
			System.out.println(l1);	
			System.out.println(l2);
	}

}
