package exe;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str,result;
		System.out.println("Pls enter a string");
		
		str=s.nextLine();
	
		result=str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
		
		System.out.println(result);
		
		
		
		

	}

}
