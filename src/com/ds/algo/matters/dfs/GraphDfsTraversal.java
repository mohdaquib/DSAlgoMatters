package com.ds.algo.matters.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GraphDfsTraversal {
    public static void main(String[] args){
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 7), new Edge(1, 8),
                new Edge(2, 3), new Edge(2, 6), new Edge(3, 4),
                new Edge(3, 5), new Edge(8, 9), new Edge(8, 12),
                new Edge(9, 10), new Edge(9, 11)
        );
        final int N = 13;
        Graph graph = new Graph(edges, N);
        boolean[] discovered = new boolean[N];

        for (int i = 0; i < N; i++){
            if (!discovered[i]){
                DFS(graph, i, discovered);
            }
        }
    }

    private static void DFS(Graph graph, int v, boolean[] discovered){
        //mark current node as discovered
        discovered[v] = true;

        System.out.println(v + " ");
        for (int u : graph.adjList.get(v)){
            if (!discovered[u]){
                DFS(graph, u, discovered);
            }
        }
    }

    private static void iterativeDfs(Graph graph, int v, boolean[] discovered){
        Stack<Integer> stack = new Stack<>();

    }
}

class Edge {
    int source, destination;
    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}

class Graph {
    List<List<Integer>> adjList = null;
    Graph(List<Edge> edges, int N){
        adjList = new ArrayList<>();

        for (int i = 0; i < N; i++){
            adjList.add(new ArrayList<>());
        }

        for (Edge edge : edges){
            int src = edge.source;
            int dest = edge.destination;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}
