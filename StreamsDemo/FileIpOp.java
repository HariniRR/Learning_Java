package StreamsDemo;
//byte Stream
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIpOp {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:\\src.txt");
        FileOutputStream out = new FileOutputStream("D:\\desti.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }
}