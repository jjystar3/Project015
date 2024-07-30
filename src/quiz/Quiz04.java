package quiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz04 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("quiz4.txt");

		byte[] arr = new byte[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = (byte) (i + 65);
		}

		fos.write(arr);

	}

}
