package arrayPrograms;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Ram is cool";
        String [] str=s.split(" ");
 

        for(int i=0; i<1; i++) {
        	String temp=str[str.length-1];
        	for(int j=str.length-1; j>0; j--) {
        		str[j]=str[j-1];
        	}
        	str[0]=temp;
        	
        }
        System.out.println(Arrays.toString(str));
	}

}
