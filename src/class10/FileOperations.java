package class10;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/dosapats/a/b/c/temp.txt");
		System.out.println(f.exists());
		File parent = f.getParentFile();
		System.out.println(parent.getAbsolutePath());
		parent.mkdirs();
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());

	}

}
