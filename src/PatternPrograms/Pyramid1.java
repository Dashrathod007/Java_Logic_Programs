package PatternPrograms;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int rows=3;
       for(int i=1; i<=rows; i++) {
    	   for(int j=1; j<=rows-i; j++) {
    		   System.out.print(" ");
    	   }
    	   for(int k=1; k<=i; k++) {
    		   System.out.print("* ");
    	   }
    	   System.out.println();
       }
	}

}
