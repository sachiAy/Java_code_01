import java.util.Scanner;

public class accept{
	public static void main(String [] args){
		String S1="54";
		String S2="66";
		
		int x = Integer.parseInt(S1);
		int y = Integer.parseInt(S2);
		
		if(x>50 && x<100 && y>50 && y<100){
			
			System.out.println("Both integers are between 50 and 100");
			
			if(S1.charAt(0)==S2.charAt(0) || S1.charAt(0)==S2.charAt(1) || S1.charAt(1)==S2.charAt(0) || S1.charAt(1)==S2.charAt(1)){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
			
			
		
				
		}else{
			System.out.println("Both integers are not between 50 and 100");	
		}
		
		
		
			
	}
}