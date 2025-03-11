package arrayPrograms;

public class ThirdMinimumNumberWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {4, 3, 2, 6, 9, 7, 5};
        int tmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++) {
        	if(a[i]<min) {
        		tmin=smin;
        		smin=min;
        		min=a[i];
        	}else if(a[i]<smin && a[i]!=min ) {
        		tmin=smin;
        		smin=a[i];
        	}else if(a[i]<tmin && a[i]!=smin) {
        		tmin=a[i];
        	}
        }
        System.out.println(min);
        System.out.println(smin);
        System.out.println(tmin);
	}

}
