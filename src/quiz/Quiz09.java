package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz09 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\Users\\G201\\Downloads");
		FileOutputStream fos = new FileOutputStream("quiz9.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		showFiles(dir, osw);

		osw.flush();
	}

	public static void showFiles(File dir, OutputStreamWriter osw) throws IOException {

		File[] files = dir.listFiles();
		
		for (File f : files) {
			osw.write(f.getName() + "\n");
		}
		
	}

}
