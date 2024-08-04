package JavaFileIO;
import java.io.File;

public class filecreatingsimple
{
        public static void main(String[] args)
        {

            // File name specified
            File obj = new File("myfile.txt");
            System.out.println("File Created!");
            System.out.println(obj.getAbsolutePath());
        }
    }


