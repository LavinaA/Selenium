package javaPractiseExample;

public class secondmaxarray {

	public static void main(String[] args) {
		int arr[] ={2,4,60,45,89,34,84};
		int print=secondmax(arr);
		for (int i=0;i<arr.length;i++){
			System.out.println("The elements of the array are "+arr[i]);
		}
		System.out.println("the largest element of the array is "+print);
	}
	public static int secondmax(int a[]){	
		
		int fmax,smax,temp;
		
		if(a[0]>a[1]){
			fmax=a[0];
			smax=a[1];
		}else {
			fmax=a[1];
			smax=a[0];
		}
		for(int i=2;i<a.length;i++){
			temp=a[i];

			if(a[i]<smax){
				continue;
			}else if(temp<=fmax && temp >=smax){

				smax=temp;
			}else if(temp>=fmax){
				smax=fmax;
				fmax=temp;
			}
		}

		return smax;

	}
}