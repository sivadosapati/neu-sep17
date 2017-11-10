package class10;

import java.io.File;

public class FileTypeFinder {

	public static void main(String[] args) {
		String extension = ".txt";
		int x = countFiles("/Users/dosapats/git", extension);
		System.out.println("Matching files with " + extension + " -> " + x);
	}

	private static int countFiles(String path, String type) {
		File file = new File(path);
		int count = 0;
		if (file.isDirectory() == false) {
			boolean b = findFileMatchingPattern(file, type);
			if (b == true)
				return 1;
			else
				return 0;
		}
		File[] allFilesInDirectory = file.listFiles();
		for (File f : allFilesInDirectory) {
			if (f.isDirectory()) {
				count += countFiles(f.getAbsolutePath(), type);
				continue;
			}
			if (findFileMatchingPattern(f, type)) {
				// count+=countFiles(f.getAbsolutePath(),type);
				count++;
			}
		}

		return count;
	}

	private static boolean findFileMatchingPattern(File file, String type) {
		String p = file.getAbsolutePath();
		// System.out.println(p);
		if (p.endsWith(type)) {
			System.out.println(p);
			return true;
		} else {
			return false;
		}
	}

}
