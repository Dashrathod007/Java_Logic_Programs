package StringPrograms;

public class SubStringsLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="shivu";
         for(int i=0; i<s.length(); i++) {
      	   for(int j=i+1; j<=s.length(); j++) {
      		   if(s.substring(i,j).length()>=3) {
      			   System.out.print(s.substring(i,j)+" ");
      		   }
      	   }
	}

	}
}
