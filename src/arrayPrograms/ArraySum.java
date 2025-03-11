
package arrayPrograms;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,3};
        int[] b= {4,5,6,7};
        int max=Math.max(a.length, b.length);
        int[] c=new int[max];
        for(int i=0; i<c.length; i++) {
        	if(i<a.length) {
        		c[i]=c[i]+a[i];
        	}
        	if(i<b.length) {
        		c[i]=c[i]+b[i];
        	}
        }
        System.out.println(Arrays.toString(c));
	}

}
