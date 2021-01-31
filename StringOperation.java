//Remove duplicate characters and display frequencies in sorted order
import java.util.Scanner;
import java.util.TreeSet;

public class StringOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		s=s.toLowerCase();//convert to LowerCase
		char c[] = s.toCharArray();
		int freq[] = new int[26];//for lower case 26 
		for(int i=0;i<c.length;i++) {
			freq[c[i]-97]++;
		}
		TreeSet<Character> lh = new TreeSet<Character>();
		for(int i=0;i<c.length;i++) {
			lh.add(c[i]);
		}
		Object obj[] = lh.toArray();
		int j=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				System.out.println(obj[j++]+" "+freq[i]);
			}
		}
	}
}
