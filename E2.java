package exe;

public class E2 {

	public static void main(String[] args) {
		String a= "Loser";
		char v=a.charAt(0);
		String v1=String.valueOf(v);
		String a1= a.replace("L","r");
		String a2=a1.substring(0,a1.length()-1);
		
		System.out.println(a2.concat(v1));
		
		
		
		

	}

}
