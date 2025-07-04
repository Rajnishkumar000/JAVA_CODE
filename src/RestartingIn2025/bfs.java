package RestartingIn2025;

import java.util.*;

public class bfs {
    private int vertices; // Number of vertices
    private List<List<Integer>> adjList; // Adjacency list

    public bfs(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph (Undirected)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // BFS Algorithm using Queue
    public void bfsTraversal(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll(); // Remove front node
            System.out.print(node + " ");

            // Enqueue all unvisited adjacent nodes
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs graph = new bfs(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("BFS Traversal starting from node 0:");
        graph.bfsTraversal(0);
    }
}

