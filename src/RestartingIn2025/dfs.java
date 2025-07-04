package RestartingIn2025;

import java.util.*;

public class dfs {
    private int vertices; // Number of vertices
    private List<List<Integer>> adjList; // Adjacency list

    public dfs(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge to the graph (undirected)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // Iterative DFS using Stack
    public void dfsPerform(int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;
            }

            // Push adjacent nodes in reverse order (for consistent output)
            List<Integer> neighbors = adjList.get(node);
//            System.out.println(neighbors);
            Collections.reverse(neighbors);//kyuki stack ulta process kar rha isliye reverse karna padega
            System.out.println(neighbors);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs graph = new dfs(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        System.out.println(graph.adjList);


        System.out.println("DFS Traversal starting from node 0:");
        graph.dfsPerform(0);
    }
}

//public void dfsRecursive(int node, boolean[] visited) {
//    if (visited[node]) return;
//
//    System.out.print(node + " ");
//    visited[node] = true;
//
//    for (int neighbor : adjList.get(node)) {
//        dfsRecursive(neighbor, visited);
//    }
//}
//
//public void dfsStart(int start) {
//    boolean[] visited = new boolean[vertices];
//    dfsRecursive(start, visited);
//}
