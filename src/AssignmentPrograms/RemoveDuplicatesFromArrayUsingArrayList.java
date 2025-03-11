package AssignmentPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 5, 7, 7, 8 };

		List<Integer> lArray=new ArrayList<Integer>();
		for(int num:a) {
			lArray.add(num);
		}
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		for(Integer hSet:lArray) {
			hs.add(hSet);
		}
		System.out.println(hs);
	}

}
