package javaPractiseExample;
//String anagrams means Nagesh and Ganesh should be equal

import java.util.Arrays;

public class Stringanagrams {

	public static void main(String[] args) {

		String str1="Nagesh";
		String str2="Ganesh";
		Boolean flag =true;
		
		if(str1.length()!=str2.length()){
			flag=false;
		}else {
			char[] ch1=str1.toLowerCase().toCharArray();
			char[] ch2=str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			flag=Arrays.equals(ch1,ch2);
		}
		if(!flag){
			System.out.println("The strings are not anagram");
		}
		else{
			System.out.println("The strings are Anagram");
		}
	}

}
