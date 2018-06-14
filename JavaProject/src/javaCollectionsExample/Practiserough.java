package javaCollectionsExample;

public class Practiserough {

	public static void main(String[] args) {

		String str="God is great";
		String [] ar =str.split(" ");
		String rev ="";
		for(int i=ar.length-1;i>=0;i--){
			rev=rev+ar[i]+" ";
		}
		System.out.println(rev);
	}

}
