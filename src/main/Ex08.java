package main;

import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("reader.txt");
//
//		while (true) {
//			int i = fis.read(); //1바이트씩 읽어오기
//			if (i == -1) { //파일 끝에 도달하면 종료
//				break;
//			}
//			System.out.print((char) i); //바이트->문자로 변환
//		}
		
		FileReader fr = new FileReader("reader.txt");
		
		while (true) {
			int i = fr.read(); //2바이트씩 읽어오기
			if (i == -1) {
				break;
			}
			System.out.print((char) i); //한글이 제대로 읽어옴
		}

	}

}
