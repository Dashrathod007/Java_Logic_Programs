package PatternPrograms;

public class PatterT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1; i<=3; i++) {
	        	for(int j=1; j<=3; j++) {
	        		if(j>=i) {
	        			System.out.print("*");
	        		}
	        		else {
	        			System.out.print(" ");
	        		}
	        	}
	        	System.out.println();	
	        	
	        }
	}

}
