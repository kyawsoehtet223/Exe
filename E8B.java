package exe;

public class E8B {
	 public static void main(String[] args) {
	        int rows = 5;
	        int num=0;

	        for(int i = 1; i <= rows; ++i) {
	        	
	            for(int j=1;j <= i; ++j) {
	            	num++;
	            	
	                System.out.print(num+"\t");
	            }
	            System.out.println();
	        }
	    }

}
