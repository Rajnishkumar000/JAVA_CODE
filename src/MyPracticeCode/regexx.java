package MyPracticeCode;
import java.util.regex.*;
import java.util.*;
public class regexx {
    public static boolean isValidIPAddress(String ip)
    {

        // Regex for digit from 0 to 255.
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeat 4 times.
        // this is the regex to validate an IP address.
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the IP address is empty
        // return false
        if (ip == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given IP address
        // and regular expression.
        Matcher m = p.matcher(ip);

        // Return if the IP address
        // matched the ReGex
        return m.matches();
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s1=in.nextLine();
        System.out.println(isValidIPAddress(s1));
        String s2=in.nextLine();
        System.out.println(isValidIPAddress(s2));
        String s3=in.nextLine();
        System.out.println(isValidIPAddress(s3));
        String s4=in.nextLine();
        System.out.println(isValidIPAddress(s4));
        String s5=in.nextLine();
        System.out.println(isValidIPAddress(s5));
        String s6=in.nextLine();
        System.out.println(isValidIPAddress(s6));
        String s7=in.nextLine();
        System.out.println(isValidIPAddress(s7));
        String s8=in.nextLine();
        System.out.println(isValidIPAddress(s8));
        String s9=in.nextLine();
        System.out.println(isValidIPAddress(s9));
        String s10=in.nextLine();
        System.out.println(isValidIPAddress(s10));
        String s11=in.nextLine();
        System.out.println(isValidIPAddress(s11));
        String s12=in.nextLine();
        System.out.println(isValidIPAddress(s12));
        String s13=in.nextLine();
        System.out.println(isValidIPAddress(s13));
        String s14=in.nextLine();
        System.out.println(isValidIPAddress(s14));
        String s15=in.nextLine();
        System.out.println(isValidIPAddress(s15));


    }
}
