package practiceProblem;
import java.util.*;
public class arra

{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[][]=new int[5][];
        int p=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            arr[i][j]=p;
            p++;
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
