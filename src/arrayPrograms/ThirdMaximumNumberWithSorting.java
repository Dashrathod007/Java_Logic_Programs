package arrayPrograms;

import java.util.TreeSet;

public class ThirdMaximumNumberWithSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 1, 3, 5, 4, 8 };
		TreeSet<Integer> tree=new TreeSet<Integer>();
		for(Integer b:a) {
			tree.add(b);
		}
		Integer[] a1=new Integer[tree.size()];
		a1=tree.toArray(a1);
		int max=a1[a1.length-1];
		int smax=a1[a1.length-2];
		int tmax=a1[a1.length-3];
		
		System.out.println(max);
		System.out.println(smax);
		System.out.println(tmax);
	}
}
