package RestartingIn2025;
import java.util.*;
public class userInputDirect {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        if(in.hasNextInt())
        {
            int k=in.nextInt();
//            int l=in.nextInt();
            System.out.println("Entered an integer");
            System.out.println("K="+k);
//            System.out.println("L="+l);
        }
    }
}
