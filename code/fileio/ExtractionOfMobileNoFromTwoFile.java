package code.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExtractionOfMobileNoFromTwoFile {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("D:\\Development with Coding\\Java-Coding\\code\\fileio\\iofile\\output.txt");
		BufferedReader br1 = new BufferedReader(
				new FileReader("D:\\Development with Coding\\Java-Coding\\code\\fileio\\iofile\\input.txt"));

		String data1 = br1.readLine();
		while (data1 != null) {
			BufferedReader br2 = new BufferedReader(
					new FileReader("D:\\Development with Coding\\Java-Coding\\code\\fileio\\iofile\\delete.txt"));
			String data2 = br2.readLine();
			boolean isAvailable = false;
			while (data2 != null) {
				if (data1.equals(data2)) {
					isAvailable = true;
				}
				data2 = br2.readLine();
			}
			if (isAvailable == false) {
				pw.write(data1 + "\n");
			}
			br2.close();
			data1 = br1.readLine();
		}

		pw.flush();
		br1.close();
		pw.close();
	}

}
