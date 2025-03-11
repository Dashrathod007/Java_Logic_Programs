package arrayPrograms;

public class SecondMinWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {4,3,4,6,5,8,3};
		 int min=Integer.MAX_VALUE;
	     int smin=Integer.MAX_VALUE;
	     for(int i=0; i<a.length; i++) {
	    	if(a[i]<min) {
	    		smin=min;
	    		min=a[i];
	    	}else if(a[i]<smin && a[i]!=min) {
	    		smin=a[i];
	    	}
	     }
	     System.out.println(min);
	     System.out.println(smin);
	}

}
