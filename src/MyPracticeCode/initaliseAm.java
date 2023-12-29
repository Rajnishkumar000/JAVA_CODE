package MyPracticeCode;
import java.util.*;

public class initaliseAm {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // n is the number of vertices
        // m is the number of edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMat = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMat[u][v] = 1;
            adjMat[v][u] = 1;
        }
    }
}

// This code is contributed by Tapesh(tapeshdua420)

