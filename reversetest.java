import java.util.Scanner;

public class reversetest{
	public static void main(String args[]){
		
		String rev="";
		int i;
		
		Scanner myobj=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String input=myobj.nextLine();
		
		char[] newInput=input.toCharArray();
		
		for(i=input.length()-1 ; i>=0 ; i-- ){
			rev=rev + newInput[i];
		}
		
		System.out.println("reverse:"+rev);
		
		
	}
}