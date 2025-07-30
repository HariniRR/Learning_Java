package StreamsDemo;
//character Stream
//for byte stream, BufferInput BufferOutput
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inputStream = new BufferedReader(new FileReader("D:\\src.txt"));
		BufferedWriter outputStream = new BufferedWriter(new FileWriter("D:\\desti.txt"));
		int c;
		while ((c = inputStream.read()) != -1) {
			outputStream.write(c);
        }

		inputStream.close();
		outputStream.close();
	}
}