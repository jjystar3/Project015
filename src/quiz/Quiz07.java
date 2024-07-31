package quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz07 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("quiz7.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("안녕하세요");
		
		osw.flush();

	}

}
