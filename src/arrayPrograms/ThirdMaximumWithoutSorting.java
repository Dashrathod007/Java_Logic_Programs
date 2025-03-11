package arrayPrograms;

public class ThirdMaximumWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {8,4,9,5,6,7,1};
       int tmax=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0; i<a.length; i++) {
    	   if(a[i]>max) {
    		   tmax=smax;
    		   smax=max;
    		   max=a[i];
    	   }else if(a[i]>smax && a[i]!=max ) {
    		   tmax=smax;
    		   smax=a[i];
    	   }else if(a[i]>tmax && a[i]!=smax) {
    		   tmax=a[i];
    	   }
       }
       System.out.println(max);
       System.out.println(smax);
       System.out.println(tmax);
	}

}
