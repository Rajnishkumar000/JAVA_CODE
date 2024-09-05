package Graphs;

import java.util.*;

public class DFS {

    static void addEdge(List<List<Integer>> adj,int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
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

        dfs(adj,visited,0);

    }

    private static void dfs(List<List<Integer>> adj, boolean[] visited, int i) {
        visited[i]=true;
        System.out.print(i+"->");

        for(int j:adj.get(i))
        {
            if(!visited[j])
            {
                dfs(adj,visited,j);
            }

        }


    }
}

