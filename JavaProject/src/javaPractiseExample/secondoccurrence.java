package javaPractiseExample;

public class secondoccurrence {

	public static void main(String[] args) {
		String str="Hello World";
		StringBuilder sb=new StringBuilder(str) ;
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch =str.charAt(i);
			if(ch=='o'){
				count ++;
			}
			if(count == 2){
				sb.setCharAt(i, 't');
				break;
			}
		}
		System.out.println(sb);
		
	}

}
