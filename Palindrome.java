package projectp1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		if(isPalindrome(a)) {
			System.out.println("Given number is a Palindrome");
		}else {
			System.out.println("Given number is not a Palindrome");
		}
	}

	private static boolean isPalindrome(int a) {
		// TODO Auto-generated method stub
		int rev=0;
		int temp =a;
		while(a>0) {
			int rem = a%10;
			rev = (rev*10)+rem;
			a = a/10;
		}
		if(temp==rev) {
			return true;
		}else {
			return false; 
		}
	}

}
