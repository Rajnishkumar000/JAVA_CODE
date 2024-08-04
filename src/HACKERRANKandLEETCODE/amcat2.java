package HACKERRANKandLEETCODE;
import java.util.Scanner;
public class amcat2 {

    public static void main(String[] args) {
        int parentPos = 3;
        int childPos = 2;
        int V1 = 2;
        int N = 20;

        int[] result = calculateFAndV2(parentPos, childPos, V1, N);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] calculateFAndV2(int parentPos, int childPos, int V1, int N) {
        int maxF = 0;
        int bestV2 = 0;

        // Iterate over possible speeds for the child
        for (int V2 = 1; V2 <= 1000; V2++) {
            int F = 0;

            // Calculate the child's position and count the number of common footsteps
            for (int step = 0; step < N; step++) {
                int parentStep = parentPos + step * V1;
                int childStep = childPos + step * V2;

                if ((childStep - childPos) % V2 == (parentStep - parentPos) % V1) {
                    F++;
                }
            }

            // Check if this V2 gives more common footsteps
            if (F > maxF || (F == maxF && V2 > bestV2)) {
                maxF = F;
                bestV2 = V2;
            }
        }

        return new int[]{maxF, bestV2};
    }
}


