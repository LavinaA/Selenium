package javaPractiseExample;

public class SeparatenumbersString {

	public static void main(String[] args) {
		String str= "Lavina123Ravi";
		String numbers;
		
		 numbers=str.replaceAll("[^0-9]", "");	
		 System.out.println(numbers);
			
		}
	}


