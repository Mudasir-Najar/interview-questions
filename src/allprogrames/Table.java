package allprogrames;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Table Number");
		int n = scan.nextInt();
		
		for(int i=0; i<=10; i++) {
	
			System.out.printf("%d*%d=%d\n", n, i, n * i);
		}

	}
}