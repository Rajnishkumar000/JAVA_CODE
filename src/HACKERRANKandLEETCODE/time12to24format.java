package HACKERRANKandLEETCODE;
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            char c = s.charAt(8);
            String hr = s.substring(0, 2);
            int hrint = Integer.parseInt(hr);

            if (c == 'P') {
                if (hrint == 12) {
                    return s.substring(0, 8);
                }
                else {
                    return (hrint+12)+""+s.substring(2,8);
                }
            }
            else{
                if (hrint==12){
                    return 00+""+s.substring(2,8);
                }
                return s.substring(0, 8);
            }
        }
    }



    public class time12to24format {
        public static void main(String[] args) throws IOException {
            Scanner in=new Scanner(System.in);

            String s = in.nextLine();
            String result = Result.timeConversion(s);
            System.out.println(result);


        }
    }


