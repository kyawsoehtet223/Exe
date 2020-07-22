package exe;

public class E9 {

	public static void main(String[] args) {
		int[] a= {3,4,5,6,7,8,9};
		int sum=0;
		int minn=a[0];
		int minn2=a[1];
		int max1=a[0];
	    int max2=a[0];
	    		
		 for( int num : a) {
	          sum = sum+num;
	      }
		 double avg=sum/a.length;
		 System.out.println("Average :"+avg);
		 
		 for(int i=1;i<a.length;i++) {
			 if(minn>a[i]) {
				 minn=a[i];
			 }else if(minn2>a[i]) {
				 minn2=a[i];
				 
			 }
			 
			 if(max1<a[i]) {
				 max1=a[i];
			 }
				 if(max2<a[i]) {
				
				max2=a[i];
				
				
				 
			 }
			 
			
					  
				 }
		 System.out.println(" Two Minimum : "+minn+" & "+minn2);
		 System.out.println(" Two Maximum : "+max1+" & "+max2);
		 
			 }
		 
		 
	}


