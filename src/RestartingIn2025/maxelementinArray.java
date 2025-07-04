package RestartingIn2025;

import java.util.Arrays;

public class maxelementinArray {
    public static void main(String[] args) {
        int arr[]={3,2,4,7,6,1,9,3};
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(max);
        System.out.println(min);

    }
}
