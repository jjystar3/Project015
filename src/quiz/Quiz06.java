package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz06 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("quiz6.txt");

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int value = i*j;
				fw.write(i + "*" + j + "=" + value + "\n");
			}
			fw.write("\n");			
		}
		
		fw.flush();

	}

}
