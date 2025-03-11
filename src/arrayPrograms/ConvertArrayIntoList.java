package arrayPrograms;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayIntoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer[] a= {1,1,2,3,4,5,2,4};
      List<Integer> list=Arrays.asList(a);
      for(int i=0;i<a.length; i++) {
     /* if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i))) {
    	  System.out.print(" " +list.get(i));
      }*/
    	  if(list.indexOf(list.get(i))!=list.lastIndexOf(list.get(i))) {
        	  System.out.print(" " +list.get(i));
          }
	}

}
}	
 