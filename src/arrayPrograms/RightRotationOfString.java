package arrayPrograms;

import java.util.Arrays;

public class RightRotationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= "Priam is good in studies";
        String[] str=s.split(" ");
        for(int i=0; i<=0; i++) {
            String temp=str[str.length-1];
        for(int j=str.length-1; j>0; j--) {
        	str[j]=str[j-1];
        }
         str[0]=temp;
        }
        System.out.println(Arrays.toString(str));
	}

}
