package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="aabbabac";//abc
        LinkedHashSet hs=new LinkedHashSet();
        for(int i=0; i<s.length(); i++) {
        	hs.add(s.charAt(i));
        }
        System.out.println(hs);
	}

}
