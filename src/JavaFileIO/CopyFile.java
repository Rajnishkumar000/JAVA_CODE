package JavaFileIO;

import java.io.File;

public class CopyFile {

    public static void main(String[] args) {
        File f = null;
        String[] strs = {"test1.txt", "test2.txt"};
        try {

            for(String s:strs ) {
                f = new File(s);
                boolean bool = f.canExecute();

                // find the absolute path
                String a = f.getAbsolutePath();

                // prints absolute path
                System.out.print(a);

                // prints
                System.out.println(" is executable: "+ bool);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}