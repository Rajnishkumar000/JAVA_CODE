package practiceProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class prime2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger a = new BigInteger(n);
        if(a.isProbablePrime(1))
            System.out.println("prime");
        else System.out.println("not prime");
//        System.out.print(a.isProbablePrime(1)?"prime":"not prime");
}
}
