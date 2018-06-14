package javaPractiseExample;

public class Reversenumber {
	
	//Program to reverse a number
	//ip->5678
	//o/p>8765

	public static void main(String[] args) {
		int number =5678;
		int rem;
		int output=0;
		
		while(number>0){
			rem=number%10;
			output=output*10+rem;
			number=number/10;
			
		}
		System.out.println("The reverse of a number is " +output);
		
		
	}
}
