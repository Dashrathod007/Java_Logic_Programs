package StringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="Masti";
          String rev="";
          for(int i=s.length()-1; i>=0; i--) {
        	  rev=rev+s.charAt(i);
          }
          System.out.println(rev);
	}

}
