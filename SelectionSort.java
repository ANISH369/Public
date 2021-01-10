package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		   int a[]= { 2,9,-3,7,6,0};
		   int n=a.length,i,j;
		   for( i=0;i<n-1;i++) {
			   int minInd=i;
			   for(j=i;j<n;j++) {
				   if(a[j]<a[minInd]) {
					   minInd=j;
				   }
			   }
			   int temp=a[i];
			   a[i]=a[minInd];
			   a[minInd]=temp;
		   }
		   for(int item:a) {
			   System.out.print(item+ " ");
		   }
		   System.out.println();
	}

}
