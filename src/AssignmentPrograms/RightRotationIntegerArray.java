package AssignmentPrograms;

import java.util.Arrays;

public class RightRotationIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1, 2, 3, 4, 5};
        for(int i=0; i<1; i++) {
        	int temp=arr[arr.length-1];
        	for(int j=arr.length-1; j>0; j--) {
        		arr[j]=arr[j-1];
        	}
        	arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
	}

}
