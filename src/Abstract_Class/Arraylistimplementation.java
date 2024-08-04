package Abstract_Class;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Arraylistimplementation
{
    public static void main(String[] args) throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(in.readLine());
        }
        System.out.println(Arrays.toString(arr));

        int arrcopy[]=new int[10];
        arrcopy=arr;
        arrcopy[6]=6;
        arrcopy[7]=7;
        System.out.println(Arrays.toString(arrcopy));

    }
}
