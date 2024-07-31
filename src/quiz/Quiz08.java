package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz08 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\Users\\G201\\Downloads");

		File[] files = dir.listFiles();
		FileOutputStream fos = new FileOutputStream("quiz8.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		for (File f : files) {
			osw.write(f.getName() + "\n");
		}
		
		osw.flush();

	}

}
