package exe;
import java.util.Scanner;
public class E4 {

	public static void main(String[] args) {
		
		 Scanner objc=new Scanner(System.in);
		 System.out.println("Pls enter :");
		 String input;
		 input=objc.nextLine();
		
		if (input.length()>3) {
	      String threechar=input.substring(0,3);
	      System.out.print(threechar);
	      System.out.print(input);
	      System.out.print(threechar);
	      System.out.println();
		}else {
			String threechar=input;
			System.out.print(threechar);
			System.out.print(input);
			System.out.print(threechar);
		}
	

	}

}
