package StreamsDemo;
//Character Stream
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReader {
    public static void main(String[] args) {
    	try {
        FileReader in = new FileReader("D:\\src.txt");
        FileWriter out = new FileWriter("D:\\desti.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();}
    	catch(Exception e) {
    		System.out.println("Exception: "+e);
    	}
    }
}