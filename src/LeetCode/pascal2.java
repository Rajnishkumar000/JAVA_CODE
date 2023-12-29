package LeetCode;

import java.util.*;



class pascal2 {
    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> dp = new ArrayList<List<Integer>>();
        ArrayList<Integer> sp = new ArrayList<Integer>();


        sp.add(1);
        dp.add(sp);//0
        if(rowIndex == 1){
            return dp.get(0);
        }
        ArrayList<Integer> sp2 = new ArrayList<Integer>();
        sp2.add(1);
        sp2.add(1);
        dp.add(sp2);//1
        for(int i = 2; i < rowIndex; i++){
            ArrayList<Integer> sp3 = new ArrayList<Integer>();
            sp3.add(1);
            List<Integer> l = dp.get(i-1);
            int a= 0;
            int b= 1;
            while(b < l.size()){
                int sum = l.get(a)+l.get(b);
                sp3.add(sum);
                a++;
                b++;
            }
            sp3.add(1);
            dp.add(sp3);
        }
        return dp.get(rowIndex-1);
    }
    public static void main(String []args){
        Scanner in= new Scanner(System.in);

        while(true){
            System.out.println("Enter Row no");
            int n=in.nextInt();

            System.out.println(generate(n));
            System.out.println();

            System.out.println("If You want to continue enter 1");
            int k=in.nextInt();
            if(k!=1)
                break;

        }

    }
}
