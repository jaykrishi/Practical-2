package practical2;

import java.io.*;
import java.util.Scanner;

public class FileExists {

	public static void main(String args[]) {

		String path = "src\\test.txt";

		doesFileExists(path);

	}

	public static void doesFileExists(String filepath) {

		File f = new File(filepath);

		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

			// Checking if the specified file exists or not
			if (f.exists()) {

				// open file to read

				String line;

				while ((line = reader.readLine()) != null) {

					line = line.replace(" - ", "\n"); // replace all commas and spaces with only commas (take out
					line = line.replace(",", "\n"); // spaces after the commas)
					System.out.println(line);
				}
				fis.close();
				reader.close();

			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("File does not Exist!");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
