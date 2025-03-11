package arrayPrograms;

import java.util.TreeSet;

public class ThirdMinimumWithSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 6, 8, 7, 5, 2 };
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (Integer m : a) {
			ts.add(m);
		}
		Integer[] a1 = new Integer[ts.size()];
		a1 = ts.toArray(a1);
		int min = a1[0];
		int smin = a1[1];
		int tmin = a1[2];

		System.out.println(min);
		System.out.println(smin);
		System.out.println(tmin);

	}

}
