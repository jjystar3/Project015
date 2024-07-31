package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		
		// 기반스트림 사용해서 파일 복사하기
		
		// 시간 측정
		long start = 0;
		long end = 0;
		
		// 입력 스트림 생성
		FileInputStream fis = new FileInputStream("a.txt");

		// 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("copy.txt");

		start = System.currentTimeMillis();
		
		while(true) {
			int i = fis.read();
			if(i==-1) {
				break;
			}
			fos.write(i);
		}
		
		end = System.currentTimeMillis();
		
//		System.out.println("파일을 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");
		System.out.println(String.format("파일을 복사하는 데 %d milliseconds 소요되었습니다.", (end - start)));
		// 1722389360324 milliseconds
		
	}

}
