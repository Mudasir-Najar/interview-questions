package allprogrames;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, term;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		term = sc.nextInt();
		int c;

		for (int i = 1; i <= term; i++) {
			
			System.out.printf(a+" ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}
