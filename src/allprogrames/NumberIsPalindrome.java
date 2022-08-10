package allprogrames;

import java.util.Scanner;

public class NumberIsPalindrome {

	public static void main(String[] args) {

		int n1, n2, s = 0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n1 = sc.nextInt();
		n2 = n1;
		
		while (n1 > 0) {
			r = n1 % 10;
			s = (s * 10) +r;
			n1 = n1 / 10;
		}
		if (n2 == s) {
			System.out.println(n2 + ": is Palindrome Number");
		} else {
			System.out.println(n2 + ": is Not Palindrome Number");
		}
	}

}
