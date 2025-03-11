package arrayPrograms;

import java.util.Arrays;

public class ShiftZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {0,1,0,2,0,3,1,0};
        int[] res=new int[a.length];
        int index=a.length-1;
        for(int i=a.length-1; i>=0; i--) {
        	if(a[i]!=0) {
        		res[index--]=a[i];
        	}
        }
        System.out.println(Arrays.toString(res));
	}

}
