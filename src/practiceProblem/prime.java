package practiceProblem;
import java.io.*;
public class prime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int a = Integer.parseInt(n);
        boolean bo = false;
        for(int i=2; i<a/2; i++){
            if(a % i == 0 ){
                bo = true;
            }
        }
        if(!bo)
            System.out.println("prime");
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}
