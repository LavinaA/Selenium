package javaPractiseExample;
//Compare 2 arrays and find the matching elements from the array
//a1={2,4,6,11,13,12}
//a2={2,22,50,4,6}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class comparingarrays {

	public static void main(String[] args) {
		int arr[]={2,4,6,11,13,12};
		int brr[]={2,22,50,4,6,12};
		comparingarrays cmp=new comparingarrays();
		ArrayList<Integer> res=cmp.getCommon(arr, brr);
		System.out.println("Input Array 1 \n"+Arrays.toString(arr));
		System.out.println("Input Array 2 \n"+Arrays.toString(brr));
		System.out.println("Result \n"+res);
			
		
	}

	public ArrayList<Integer>  getCommon(int arr[],int brr[]){
		ArrayList<Integer> res =new ArrayList<>();
		Set<Integer> set=new HashSet<Integer>();

		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		for(int i=0;i<brr.length;i++){
			if(set.contains(brr[i])){
				res.add(brr[i]);
			}
		}
		return res;
	}
}
