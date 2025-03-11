package StringPrograms;

public class ReverseStringWithoutReversingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Bengaluru is clean city";
        String s1=s.replace(" ", "");
        int index=s1.length()-1;
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)==' ') {
        		System.out.print(" ");
        	}else {
        		System.out.print(s1.charAt(index--));
        	}
        }
	}

}
