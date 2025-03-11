package arrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicatedIndexOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1, 2, 1, 2, 3, 3, 4, 1};
         LinkedHashMap<Integer,ArrayList<Integer>> hash=new LinkedHashMap<Integer,ArrayList<Integer>>();
         for(int i=0; i<a.length; i++) {
        	 if(hash.containsKey(a[i])) {
        		 hash.get(a[i]).add(i);
        	 }else {
        		 hash.put(a[i], new ArrayList<Integer>());
        	 }
         }
         //System.out.println(hash);
         for(Entry<Integer, ArrayList<Integer>> map:hash.entrySet()) {
        	 if(map.getValue().size()>0) {
        		 System.out.println(map.getKey() + " " + map.getValue());
        	 }
         }
	}

}
