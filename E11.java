package exe;

import java.util.Scanner;

public class E11 {
	public static void main(String[] arg) {
	 Scanner objc=new Scanner(System.in);
	 System.out.println("Pls enter num :");
	 int a;
	 a=objc.nextInt();
	 for(int i=1;i<=12;i++) {
		 System.out.print(a+"*"+i+" : ");
		 System.out.println(a*i);
	 }
}
}