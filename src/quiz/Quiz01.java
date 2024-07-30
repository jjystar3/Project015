package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] num = new int[5];
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		
//		System.out.println("배열:[" + num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4] +  "]" );
		System.out.println("배열:" + Arrays.toString(num));
		System.out.println("숫자 " + num.length + "개의 합은 " + sum + "입니다");

	}
	
}
