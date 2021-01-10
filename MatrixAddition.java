package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Dimentions: ");
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int a[][]= new int[rows][columns];
		int b[][]= new int[rows][columns];
		System.out.println("Enter the array a: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the array b: ");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					b[i][j]=sc.nextInt();
				}
		}
			
			int c[][]= new int[rows][columns];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
				}
			System.out.println("result array c is : ");
				for(int i=0;i<rows;i++) {
					for(int j=0;j<columns;j++) {
				System.out.print(c[i][j]+" ");		
					}	
					System.out.println();
		}
	}

}
