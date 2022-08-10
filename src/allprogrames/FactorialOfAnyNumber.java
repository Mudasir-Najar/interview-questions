package allprogrames;

import java.util.Scanner;

public class FactorialOfAnyNumber {

	public static void main(String[] args) {

		int n1, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {

			c = c * i;
		}
		System.out.println("factorial of  n1 :=" + c);
	}
}
