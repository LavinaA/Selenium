import java.util.LinkedHashMap;
import java.util.Map;

public class denominationsnote {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		int num=7586;
		int noofnotes=0;
		
	
		if(num>=2000){
			map.put(2000,num/2000);
			num=num%2000;
			
		}
		if((num>=500)&&(num<2000)){
			map.put(500,num/500);
			num=num%500;
			
		}
		if((num>=200) && (num<500)){
			map.put(200,num/200);
			num=num%200;
		}
		if((num>=100) &&(num<200)){
			map.put(100,num/100);
			num=num%100;
			
		}
		if((num>=50) &&(num<100)){
			map.put(50,num/50);
			num=num%50;
			
		}
		if((num>=20) &&(num<50)){
			map.put(20,num/20);
			num=num%20;
			
		}
		if((num>=10) &&(num<20)){
			map.put(10,num/10);
			num=num%10;
			
		}
		if((num>=5) &&(num<10)){
			map.put(5,num/5);
			num=num%5;
			
		}
		if((num>=2) &&(num<5)){
			map.put(2,num/2);
			num=num%2;
		}
		if((num>=1) &&(num<2)){
			map.put(1,num);
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			System.out.print("Note " +entry.getKey());
			System.out.print(" The no of notes "+entry.getValue());
			System.out.println();
			
		}
		
		}
}
