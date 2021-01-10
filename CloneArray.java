package arrays;

import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int ar[]= {1,2,3,4};
		Object[] arr1= {arr};
		Object[] arr2= {ar};
		if(Arrays.deepEquals(arr1,arr2)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		int cloneArray[]=arr.clone();
  System.out.println(arr==cloneArray);
   for(int i:cloneArray) {
	   System.out.println(i);
   }
	}

}
