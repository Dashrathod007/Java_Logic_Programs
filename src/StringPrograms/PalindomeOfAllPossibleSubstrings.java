package StringPrograms;

public class PalindomeOfAllPossibleSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="aabbabac";
          for(int i=0; i<s.length(); i++) {
        	  for(int j=i+1; j<=s.length(); j++) {
        		  String s1=s.substring(i,j);
        		  String sb=new StringBuilder(s1).reverse().toString();
        		  if(s1.equals(sb)) {
        			  System.out.println(s1);
        		  }
        	  }
          }
	}

}
