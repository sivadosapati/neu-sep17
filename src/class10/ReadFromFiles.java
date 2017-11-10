package class10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFromFiles {

	public static void main(String[] args) throws IOException {
		readAndWriteInFiles();
		// System.out.println(isFileContainingWord(new
		// File("/Users/dosapats/beanshell.txt"), "Bokin"));
	}

	private static boolean isFileContainingWord(File file, String word) throws FileNotFoundException, IOException {
		String contents = readFromFile(file);
		if (contents.contains(word)) {
			return true;
		} else {
			return false;
		}
	}

	private static void readAndWriteInFiles() throws FileNotFoundException, IOException {
		File file = new File("/Users/dosapats/beanshell.txt");
		String s = readFromFile(file);
		System.out.println("Before...");
		System.out.println(s);
		System.out.println("After...");

		writeToFile("Trying something new -> " + Math.random() + "\n", file);
		System.out.println(readFromFile(file));
	}

	private static void writeToFile(String string, File file) throws IOException {
		FileOutputStream fos = new FileOutputStream(file, true);
		byte b[] = string.getBytes();
		fos.write(b);
		fos.close();

	}

	private static String readFromFile(File file) throws FileNotFoundException, IOException {
		// File file = new File("c:\\siva\\a.txt");
		StringBuilder builder = new StringBuilder();
		FileInputStream fis = new FileInputStream(file);
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char c = (char) x;
			builder.append(c);
		}
		fis.close();
		return builder.toString();
	}

}
