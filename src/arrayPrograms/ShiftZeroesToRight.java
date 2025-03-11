package arrayPrograms;

import java.util.Arrays;

public class ShiftZeroesToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,1,0,2,0,3,1,0};
        int[] res=new int[a.length];
        int index=0;
        for(int i=0; i<a.length-1; i++) {
        	if(a[i]!=0) {
        		index++;
        		res[index-1]=a[i];
        	}
        }
        System.out.println(Arrays.toString(res));
	}
}



