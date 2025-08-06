import java.io.File;
import java.io.IOException;

public class FileDel {
    public static void main(String[] args) {
        File obj = new File("myFile.txt");
        // Create a file
        try {
            if (obj.createNewFile()) {
                System.out.println(" file created: " + obj.getName());
            } else {
                System.out.println(" file already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating  file: " + e.getMessage());
        }

        // Attempt to delete the file
        if (obj.exists()) {
            if (obj.delete()) {
                System.out.println("File deleted successfully: " + obj.getName());
            } else {
                System.out.println("Failed to delete the file: " + obj.getName() + " (It might be in use or permissions are insufficient)");
            }
        } else {
            System.out.println("File does not exist: " + obj.getName());
        }
    }
}
/*If the file is currently open by another process or by your own Java application (e.g., a FileOutputStream or FileInputStream is still active on it), delete() might fail[file.delete()]. Ensure all streams associated with the file are closed before attempting deletion.*/
