package tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * This program reads 'myTestFile.txt' file and prints it line by line.
 *  
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class ReadTestFile {

	public static void main(String[] args)  throws IOException{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			// Create FileReader instance
			fileReader = new FileReader("myTestFile.txt");

			// Create BufferedReader instance from FileReader
			bufferedReader = new BufferedReader(fileReader);

			String line;

			// Read and print each line of file
			while( (line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Opearation failed");
		} finally {
			// Close the file
			fileReader.close();
		}

	}

}