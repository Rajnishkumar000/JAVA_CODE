package JavaFileIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class writefile {
        public static void main(String[] args) {
            // Specify the file name
            String fileName = "output.txt";

            // Text to write to the file
            String textToWrite = "Hello, World!\nWelcome to writing files in Java.";

            // Use try-with-resources to ensure the file is closed properly
            try (FileWriter fw = new FileWriter(fileName);
                 BufferedWriter bw = new BufferedWriter(fw)) {

                // Write text to the file
                bw.write(textToWrite);

                System.out.println("Successfully written to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }


