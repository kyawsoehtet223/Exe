package exe;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Pls enter int");
		
		String s;
		s=c.nextLine();
		String result;
		for(int i=0;i<s.length();i++) {
			result=s.substring(i,i+2);
			System.out.println(result+",");
			i++;
			
		}
		

	}

}
