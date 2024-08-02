package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz10 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\Users\\G201\\Downloads");

		FileOutputStream fos = new FileOutputStream("quiz10.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);

		showFiles(dir, osw, 0);

		osw.flush();

	}

	public static void showFiles(File dir, OutputStreamWriter osw, int tab) throws IOException {

		File[] files = dir.listFiles();

		for (File f : files) {
			for (int i = 0; i < tab; i++) {
				osw.write("\t\t");
			}
			osw.write(f.getName() + "\n");
			if (f.isDirectory()) {
				showFiles(f, osw, tab + 1);
			}
		}

	}
}

// 호출 순서
// main()
// factorial(3)
// 3 * factorial(2)
// factorial(1)

// 완료 순서
// factorial(1)
// 3 * factorial(2)
// factorial(3)
// main()
