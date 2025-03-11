package AssignmentPrograms;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="elbow";
       String s2="below";
       if(s1.length()==s2.length()) {
    	   char[] ch1=s1.toCharArray();
    	   char[] ch2=s2.toCharArray();
    	   
    	   Arrays.sort(ch1);//elbow
    	   Arrays.sort(ch2);//below
    	   
    	   //we can't compare Arrays directly so we convert to String
    	   String s3=new String(ch1);
    	   String s4=new String(ch2);
    	   
    	   if(s3.equals(s4)) {
    		   System.out.println("The given strings are Anagrams");
    	   }else {
    		   System.out.println("The given strings are not Anagrams");
    	   }
       }
	}

}
