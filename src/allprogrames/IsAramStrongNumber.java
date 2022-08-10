package allprogrames;

import java.util.Scanner;

public class IsAramStrongNumber {
	public static void main(String[] args) {

		int n, temp, result = 0, lastDigit;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number");
		n = scan.nextInt();
		temp = n;

		while (temp > 0) {
			lastDigit = temp % 10;      //371
			result = result + lastDigit * lastDigit * lastDigit;
			temp = temp / 10;

		}
		if (result == n) {
			System.out.println("Number Is ArmStrong");
		} else {
			System.out.println("Not An ArmStrong Number");
		}

	}

}
