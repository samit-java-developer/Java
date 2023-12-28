package code.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile1File2ToFile3 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// File f = new File("abc.txt"
		PrintWriter pw = new PrintWriter("D:\\Development with Coding\\Java-Coding\\code\\fileio\\iofile\\file3.txt");
		BufferedReader br = new BufferedReader(new FileReader("D:\\Development with Coding\\Java-Coding\\code\\fileio\\iofile\\file1.txt"));
		String data = br.readLine();
		while (data != null) {
			pw.write(data + "\n");
			data = br.readLine();
		}
		br = new BufferedReader(new FileReader("D:\\Development with Coding\\Java-Coding\\code\\fileio\\iofile\\file2.txt"));
		data = br.readLine();
		while (data != null) {
			pw.write(data + "\n");
			data = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
