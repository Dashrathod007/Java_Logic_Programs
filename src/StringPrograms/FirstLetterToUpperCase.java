package StringPrograms;

public class FirstLetterToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="qa job is the best job";
        String[] str=s.split(" ");
        for(int i=0; i<str.length; i++)
        {
        	String s1=str[i];
        	System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
        }
	}

}
