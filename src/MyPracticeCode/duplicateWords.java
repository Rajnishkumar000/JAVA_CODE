package MyPracticeCode;

import java.util.regex.*;
import java.util.*;

    public class duplicateWords {

        public static void main(String[] args) {
            String regex = "\\b(\\w+)(\\W+\\1\\b)+";
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            while (n > 0)
            {
                String input = in.nextLine();

                Matcher m=p.matcher(input);


                while (m.find())
                {
                    input = input.replaceAll(m.group(), m.group(1));
                }


                System.out.println(input);
                n=n-1;
            }
        }
    }


