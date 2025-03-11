package arrayPrograms;

public class SecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] a={2,1,3,5,4};
        int smax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++) {
        	if(a[i]>max) {
        	smax=max;
        	max=a[i];
        }else if(a[i]>smax && a[i]!=max) {
        	smax=a[i];
        }
        }
        	System.out.println("Second maximum no is ===> "+smax);


}
}
