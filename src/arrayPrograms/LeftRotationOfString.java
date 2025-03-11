package arrayPrograms;

import java.util.Arrays;

public class LeftRotationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= "Ram is cool";
        String [] str=s.split(" ");
 

        for(int i=1; i<=1; i++) {
        	String temp=str[0];
        	for(int j=0; j<str.length-1; j++) {
        		str[j]=str[j+1];
        	}
        	str[str.length-1]=temp;
        	
        }
        System.out.println(Arrays.toString(str));
	}

}
