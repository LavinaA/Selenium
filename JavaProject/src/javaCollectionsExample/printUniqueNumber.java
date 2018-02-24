package javaCollectionsExample;

import java.util.ArrayList;

public class printUniqueNumber {

	public static void main(String[] args) {
		int a[]={1,2,4,2,3,4,3,3};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();

		for(int i=0;i<a.length;i++)
		{	int k=0;
		if(!ar.contains(a[i]))
		{
			ar.add(a[i]);
			k++;

			for(int j=i+1;j<a.length;j++){

				if(a[i]==a[j]){
					k++;
				}
			}
			System.out.println(a[i]);
			System.out.println(k);
			if(k==1)
				System.out.println(a[i] + " is the unique number");
		}
		
		}
		
		
	}

}
