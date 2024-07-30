package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력하세요:");
			String s = scanner.nextLine();
			if(s.equalsIgnoreCase("STOP")) {
				System.out.println("프로그램이 종료되었습니다");
				break;
			}
		}

	}

}
