package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz05 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("quiz5.txt");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
//				fw.write(i); // 숫자로 인식 -> 코드체계에 따라 문자로 변환
				fw.write(i + " ");
			}
		}
		
		fw.flush();

	}

}
