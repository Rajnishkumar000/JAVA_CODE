package Test;

import java.util.Scanner;

public class ceaser_cipher {
    public static void main(String[] args) {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result="";
        Scanner in=new Scanner(System.in);
        String alphabet=in.nextLine();
        alphabet=alphabet.toUpperCase();
        int key=in.nextInt();
        int index=0;

        //FOR ENCRYPTING
        for(int i=0;i<alphabet.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(s.charAt(j)==alphabet.charAt(i))
                {
                    index=j;
                    break;

                }

            }
            int res=(index+key)%26;
            result=result+(s.charAt(res));
        }
        System.out.println("Encrypted Text is "+result);

        // FOR DECRYPTING

        System.out.println("Decrypting..........");
        for(int i=0;i<25;i++)
        {
            System.out.print(i+1+".");
            for(char j:result.toCharArray())
            {
                int en=(s.indexOf(j)+i)%26;
                System.out.print(s.charAt(en));

            }
            System.out.println();
        }

    }
}
