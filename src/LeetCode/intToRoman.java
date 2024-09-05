package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class intToRoman
{
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter an Integer Value ");
        int n=Integer.parseInt(in.readLine());
        intToRoman obj=new intToRoman();
        String Roman=obj.convertintToRoman(n);
        System.out.println(Roman);

        System.out.println("Enter a Roman Value");
        String s=in.readLine();
        int numbers=obj.convertRomanToint(s);
        System.out.println(numbers);
    }

    private int convertRomanToint(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = hm.get(ch);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
        
    }

    private String convertintToRoman(int num) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();
        String res="";

        for (int i = 0; i < romanValues.length; i++) {
            while (num >= romanValues[i]) {
                roman.append(romanSymbols[i]);
                res=res+romanSymbols[i];
                num -= romanValues[i];

            }
        }
        System.out.println(res);

        return roman.toString();
    }
}

