package RestartingIn2025;

import java.util.Scanner;

public class powerValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        Double logV=Math.log(a)/Math.log(3);
        System.out.println(logV);
        System.out.println(Math.abs(logV - Math.round(logV)) < 1e-10);
    }
}
