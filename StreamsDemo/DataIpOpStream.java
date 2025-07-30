package StreamsDemo;
//Byte Stream
import java.io.*;

public class DataIpOpStream {
    public static void main(String[] args) {
        String fileName = "D:\\datafile.dat";

        // Write data using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeFloat(99.99f);
            dos.writeUTF("Welcome to StreamsDemo");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }

        // Read data using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int id = dis.readInt();
            float price = dis.readFloat();
            String message = dis.readUTF();

            System.out.println("\nData read from file:");
            System.out.println("ID: " + id);
            System.out.println("Price: " + price);
            System.out.println("Message: " + message);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
