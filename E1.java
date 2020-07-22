package exe;

import java.util.Scanner;

public class E1 {
	public static void main(String[] arg) {
		 Scanner objc=new Scanner(System.in);
		 System.out.println("Pls enter :");
		 String a;
		 a=objc.nextLine();
		int num=a.length()-1;		
		System.out.println(num);
		char v=(a.charAt(num));
		String v1=String.valueOf(v);
		System.out.println("Normal string :"+a);
		System.out.print("After fix : "+v);
		System.out.print(a.concat(v1));
	}

}

