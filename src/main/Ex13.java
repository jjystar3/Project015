package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) throws IOException {

		// File: 파일 정보를 담는 클래스 (활용도가 제일 높음)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음
		
		// newfile.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\JeongJuYoung\\newfile.txt");

		//실제 파일 생성
		file.createNewFile();
		
	}

}
