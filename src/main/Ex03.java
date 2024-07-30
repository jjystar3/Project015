package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		// 텍스트파일과 연결된 입력스트림 생성
		FileInputStream fis = new FileInputStream("input.txt");
		
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		
		// 이전의 스트림은 사용이 끝남. 새로운 스트림을 생성해야함
		FileInputStream fis2 = new FileInputStream("input.txt");
		System.out.println((char)fis2.read());
		System.out.println((char)fis2.read());
		System.out.println((char)fis2.read());

	}

}
