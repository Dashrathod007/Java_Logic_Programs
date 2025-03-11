package AssignmentPrograms;

import java.util.TreeSet;

public class SecondMinWithSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer[] arr= {4,3,4,6,5,8,3};
       int min=Integer.MAX_VALUE;
       int smin=Integer.MAX_VALUE;
       TreeSet<Integer> tree=new TreeSet<Integer>();
       for(Integer x:arr) {
    	   tree.add(x);
       }
       Integer[] arr1=new Integer[tree.size()];
       arr1=tree.toArray(arr1);
       min=arr1[0];
       smin=arr1[1];
       
       System.out.println(min);
       System.out.println(smin);
	}

}
