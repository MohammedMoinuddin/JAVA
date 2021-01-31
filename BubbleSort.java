import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			ar[i]= sc.nextInt();
		}
		bubbleSort(ar,n);
		System.out.println(Arrays.toString(ar));//print array without using for loop
	}
	private static void bubbleSort(int[] ar,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}
}
