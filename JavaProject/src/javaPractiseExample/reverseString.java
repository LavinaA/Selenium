package javaPractiseExample;

import java.util.Scanner;

public class reverseString {
	
	public static String reverse1(String a){
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String s=reverse1(str);
		System.out.println("Reverse of string "+str+" is "+s);
	}


}







