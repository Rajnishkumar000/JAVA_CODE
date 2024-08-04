package JavaFileIO;
// Importing File Class
import java.io.File;

import java.io.File;
import java.io.IOException;

public class creatingiFile {
    public static void main(String[] args) {
        // Specify the path of the file
        File file = new File("newfile.txt");

        try {
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
                System.out.println(file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

