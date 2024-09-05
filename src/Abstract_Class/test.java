package Abstract_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;



class abc{
    String name;
    int regd;

    public String getName() {
        return name;
    }

    public int getregd() {
        return regd;
    }
}

public class test extends abc{
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Kitne objects chahiye?");
        int a=Integer.parseInt(in.readLine());
        abc[] arr= new abc[a];
        for (int i = 0; i < a; i++) {
            arr[i]=new abc();
            System.out.println("Enter name"+(i+1));
            arr[i].name=in.readLine();


            System.out.println("Enter Reg no");
            arr[i].regd=Integer.parseInt(in.readLine());
        }


        Arrays.sort(arr, new Comparator<abc>() {
            @Override
            public int compare(abc p1, abc p2) {
                // First, compare by name (ignoring case)
                int nameCompare = p1.getName().compareToIgnoreCase(p2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                // If names are equal, compare by age
                return Integer.compare(p1.getregd(), p2.getregd());
            }
        });


        for(int i=0;i<a;i++){
            System.out.println(arr[i].name);
            System.out.println(arr[i].regd);
}
}
}