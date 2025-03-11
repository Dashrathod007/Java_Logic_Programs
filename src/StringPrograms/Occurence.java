package StringPrograms;

import java.util.LinkedHashMap;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="aabbabac";
        LinkedHashMap<Character, Integer> hs=new LinkedHashMap();
        for(int i=0;i<s.length(); i++) {
        	char ch=s.charAt(i);
        	if(hs.containsKey(ch)) {
        		hs.put(ch, hs.get(ch)+1);
        	}else {
        		hs.put(ch, 1);
        	}
        }
        System.out.println(hs);
	}

}
