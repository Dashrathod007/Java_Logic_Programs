package AssignmentPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="aaebbaccad";
        LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
        for(int i=0; i<s.length(); i++) {
        	hs.add(s.charAt(i));
        }
        System.out.println(hs);
	}

}
