package PatternPrograms;

public class PatternT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row=3;
         for(int i=1; i<=row; i++) {
        	 for(int j=1; j<=row; j++) {
        		 if(i+j<=(row+1)) {
        			 System.out.print("*");
        		 }else
        			 System.out.print(" ");
        	 }
        	 System.out.println();
         }
	}

}
