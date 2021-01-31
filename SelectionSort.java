/* 
 The selection sort technique is based upon selecting the minimum or maximum value in array. 
 Array is scanned to locate the minimum value, once it is found, it is placed in
the first position of the array (position 0 ). The remaining elements are scanned to find the
second smallest element and is placed in the second position (position 1 ) and so on until
the array is sorted. 
 */
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			ar[i]= sc.nextInt();
		}
		selectionSort(ar,n);
		System.out.println(Arrays.toString(ar));//print array without using for loop
	}

	private static void selectionSort(int[] ar, int n) {
		int min=0;
		for(int i=0;i<n;i++) {
			min = i;
			for(int j=i+1;j<n;j++) {
				if(ar[j]<ar[min]) {
					min=j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
	}
}

