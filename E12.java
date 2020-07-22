package exe;

import java.util.Scanner;

public class E12 {
	public static void main(String[] arg) {
		Scanner obj = new Scanner(System.in);

		int s1, s2;
		String op="";
		
		System.out.println("Pls enter first value");
		s1 = obj.nextInt();

		System.out.println("Pls enter second value");
		s2 = obj.nextInt();
		
		System.out.println("Pls enter operator");
		op = obj.next().toString();
		
		switch (op) {
		case "+":
			System.out.println(s1 + s2);
			break;
		case "-":
			System.out.println(s1 - s2);
		case "*":
			System.out.println(s1 * s2);
		case "/":
			System.out.println(s1 / s2);
		}

	}
}