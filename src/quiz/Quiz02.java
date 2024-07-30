package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int num1 = num / 10;
		int num2 = num % 10;
		int sum = num1 + num2;
		
		
		System.out.println("십의자리와 일의자리의 합은 " + sum + "입니다");

	}

}
