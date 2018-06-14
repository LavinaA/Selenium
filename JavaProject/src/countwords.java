
public class countwords {
	//Input-My name is Lavina
	//o/p-> 4

	public static void main(String[] args) {
		String str="My name is Lavina";
		int count=1;
		for(int i=0;i<=str.length()-1;i++){
			
			if(( str.charAt(i)== ' ')&&(str.charAt(i+1)!= ' ')){
				count++;
			}
			
		}
			System.out.println("NO of words in a string is "+count);
	
	}

}
