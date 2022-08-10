package allprogrames;

import java.util.Scanner;

public class IsPrimeNumberOrNot {

	public static void main(String[] args) {

		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Not Prime Number");

		}
	}
}
