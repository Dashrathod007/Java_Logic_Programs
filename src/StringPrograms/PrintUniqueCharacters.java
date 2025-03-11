package StringPrograms;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="aagbbabacde";
         for(int i=0; i<s.length(); i++) {
        	 char ch=s.charAt(i);
        	 if(s.indexOf(ch)==s.lastIndexOf(ch)) {
        		 System.out.print(" " +ch);
        	 }
         }
	}

}
