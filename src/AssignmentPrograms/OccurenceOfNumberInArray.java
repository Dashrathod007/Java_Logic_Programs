package AssignmentPrograms;

import java.util.LinkedHashMap;

public class OccurenceOfNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {4,6,5,9,6,5,5,4,10};
         LinkedHashMap<Integer, Integer> hm=new LinkedHashMap<Integer, Integer>();
         for(int i=0; i<a.length; i++) {
        	 int temp=a[i];
        	 if(hm.containsKey(temp)) {
        		 hm.put(temp, hm.get(temp)+1);
        	 }else {
        		 hm.put(temp, 1);
        	 }
         }
         System.out.println(hm);
	}

}
