package main;

import java.io.FileWriter;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		// 문자 기반 출력 스트림 생성
		// 해당 파일이 있으면 연결, 없으면 새로 생성
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A');
		
		fw.write("안녕하세요");
		
		fw.write('\n');
		
		char[] arr = {'a','b','c'};
		fw.write(arr);
		
		// filewriter는 버퍼를 사용하여, 데이터를 모았다가 한번에 출력함
		// 버퍼: 데이터를 임시로 저장하는 공간
		fw.flush();
		
		
	}

}
