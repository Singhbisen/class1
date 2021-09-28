/*Q 3 Write a program that prompts the user to input an integer 
and then outputs the number with the digits reversed.
For example, if the input is 12345, the output should be 54321.
*/
package assignment2;
import java.util.*;
public class Question3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	int reverse = 0;  
	
	while(num != 0)   
	{  
	int remainder = num % 10;  
	reverse = reverse * 10 + remainder;  
	num = num/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
sc.close();
	
	}

}
