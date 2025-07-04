package RestartingIn2025;

public class shiftOperator {
    public static void main(String[] args) {
        for(int i=1;i<5;i++)
            System.out.println(i+" "+(i<<1));
        System.out.println("OPPOSITE");
        for(int i=1;i<5;i++)
            System.out.println(i+" "+(i>>1));

        System.out.println("DOUBLE SHIFT");
        for(int i=1;i<5;i++)
            System.out.println(i+" "+(i<<2));

        System.out.println("TESTING1");
        for(int i=1;i<5;i++)
            System.out.println(i+" "+(2<<i));

        System.out.println("TESTING2");
        for(int i=1;i<5;i++)
            System.out.println(i+" "+(4<<i));

        System.out.println("TESTING3");

        for(int i=1;i<5;i++)
            System.out.println(i+" "+(i<<4));
    }

}


