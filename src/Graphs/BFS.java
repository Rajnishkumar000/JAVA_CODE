package Graphs;

import java.util.*;

public class BFS
{


    static void bfs(List<List<Integer>> adj, int s,
                    boolean[] visited) {

        // Create a queue for BFS
        Queue<Integer> q = new LinkedList<>();

        // Mark the source node as visited and
        // enqueue it
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty())
        {
            int curr=q.poll();
            System.out.print(curr+"->");

            for(int x:adj.get(curr))
            {
                if (!visited[x]) {
                    visited[x] = true;
                    q.offer(x);
                }
            }
        }
        System.out.println("NULL");

    }


        static void addEdge(List<List<Integer>> adj,int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void bfsDisconnected(List<List<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()]; // Not visited

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                bfs(adj, i, visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int V=8;
        List<List<Integer>> adj=new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 0, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 7);
        addEdge(adj, 3, 5);

        boolean[] visited = new boolean[V];
        bfsDisconnected(adj);



    }
}
//Time Complexity of BFS Algorithm: O(V + E)
//Auxiliary Space of BFS Algorithm: O(V)
