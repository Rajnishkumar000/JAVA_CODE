package RestartingIn2025;

public class reverseBit {
//    public static int reverseBits(int n) {
//        String binary = Integer.toBinaryString(n);       // get binary string
//        StringBuilder sb=new StringBuilder(binary);
//        String r=sb.reverse().toString();
//
//        return Integer.parseInt(r,2);
//
//    }

    public static int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        System.out.println(binary);
        StringBuilder sb=new StringBuilder(binary);
        String r=sb.reverse().toString();


        return (int)Long.parseLong(r,2);
//        return Integer.parseInt(r,2);

    }
    public static void main(String args[])
    {
        System.out.println(reverseBits(999999999));
    }
}
