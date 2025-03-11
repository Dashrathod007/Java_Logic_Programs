package arrayPrograms;

import java.util.LinkedHashSet;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {10,5,8,7,6,9,9,7};
          int target=15;
          LinkedHashSet set=new LinkedHashSet();
          for(int i=0; i<a.length; i++) {
        	  for(int j=i+1; j<a.length; j++) {
        		  if(a[i]+a[j]==target) {
        			  String s=a[i]>a[j]?"("+a[i]+","+a[j]+")":"("+a[j]+","+a[i]+")";
        			  set.add(s);
        		  }
        	  }
          }
          System.out.println(set);
	}

}
