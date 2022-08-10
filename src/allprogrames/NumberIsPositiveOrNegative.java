package allprogrames;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n = sc.nextInt();
		
		if(n>0) {
			System.out.println(n+ " : is positive Number");
		}
		else if(n<0) {
			System.out.println(n+ " : is Negative Number");
		}
		
	}

}
