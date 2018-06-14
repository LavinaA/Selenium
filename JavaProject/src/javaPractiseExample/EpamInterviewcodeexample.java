package javaPractiseExample;

public class EpamInterviewcodeexample {

	public static void main(String[] args) {
		
		String str = "My name is Lavina";
		str=str.toLowerCase();
		String[] str1 = str.split(" ");
		String outputString = xyz(str1);
		System.out.println("The word with highest score is "+outputString);
	}
	
	public static String xyz(String[] str1){
		
		int[] arr =new int[str1.length];
		int max;
		int index =0;
		for (int i=0;i<str1.length;i++){

			int score =getScore(str1[i]);
			arr[i]=score;
		}
		for (int j=0;j<arr.length;j++){
			max=arr[0];
			if(arr[j]>max){
				index=j;
			}
		}
		return str1[index];
	}
	
	public static int getScore(String str){
		int sum=0;
		for(int i=0;i<str.length();i++){
		char ch =str.charAt(i);
		sum+=sum+ch;
		}
		return sum;
		
	}

}
