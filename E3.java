package exe;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Pls enter string :");
		 String a; 
		 int n;
		 a=obj.nextLine();
		 Scanner obj2=new Scanner(System.in);
		 System.out.println("Pls enter index :");
		 n=obj2.nextInt();
		 String a1=Dele(a,n);
		 System.out.println("After sub : "+a1);
	}
	private static String Dele(String str,int index) {
		return str.substring(0,index)+str.substring(index+1);
		
	}

}
