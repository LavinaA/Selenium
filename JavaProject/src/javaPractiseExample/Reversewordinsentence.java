package javaPractiseExample;

//i/p->My name is Lavina
//o/p ->ym eman si anival
public class Reversewordinsentence {
	
	public static void main(String[] args) {
		String str ="My name is Lavina";
		String [] s=str.split(" ");
	//	String word = " ";
		
		String reversestring=" ";
		
		for(int i=0;i<=s.length-1;i++)
		{
			String word=s[i];
			String reverseword =" ";
			for(int j=word.length()-1;j>=0;j--)
			{	
				reverseword=reverseword+word.charAt(j);
			}
			reversestring =reversestring + reverseword;
		}
		
		System.out.println("Reverse of "+str +" is " +reversestring);
	}
	
	

}
