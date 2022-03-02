package Assignment;

import java.util.Scanner;

/*
 * Q2. You will be given two x & y as input, you have to compute x/y. 
 * if x and y are not integers or if y is zero, exception will occur and you have to report it. 
 */

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x, y;
			System.out.println("Enter x");
			x = sc.nextInt();
			System.out.println("Enter y");
			y = sc.nextInt();

			if ((x % y) == 0) {
				System.out.println(x / y);
			}

		} catch (Exception e) {
			System.out.println("Invalid entry");
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
}
