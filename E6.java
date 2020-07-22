package exe;

import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		int fact,num;
		fact=1;
		
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Pls enter a number : ");
		 num=obj.nextInt();
		 for(int i=1;i<=num;i++){
			 fact=fact*i;
		 

	}
		 System.out.println("Factorial of "+num+" is "+fact);

}
}