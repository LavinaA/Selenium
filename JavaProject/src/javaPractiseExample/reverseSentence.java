package javaPractiseExample;

//Program to reverse strings in a sentence
//Eg-God is great 
//o/p should be -taerg si dog

public class reverseSentence {

	public static void main(String[] args) {

		String str="God is great";
		String [] ar =str.split(" ");
		//String rev ="";
		StringBuilder sb =new StringBuilder();
		for(int i=ar.length-1;i>=0;i--){
			//rev=rev+ar[i]+" ";
			sb.append(ar[i]).append(" ");
		}
		//System.out.println(rev.trim());
		System.out.println(sb.toString().trim());
	}
}