//Q1 Write a program to calculate the sum of first 10 natural number.
package assignment2;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int i,sum=0;
		
		for(i=0;i<=n;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first "+n+" natural number is: " + sum);
		
sc.close();
	}
}
