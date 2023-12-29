package MyPracticeCode;
import java.util.*;
import java.util.regex.Pattern;
public class patternCheck
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){

            try{
                Pattern.compile(in.nextLine());
                System.out.println("Valid");
            }

            catch (Exception e){
                System.out.println("Invalid");
                System.out.println(e);

            }
            testCases--;

        }
    }
}
