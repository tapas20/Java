import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));
    }

    public static void getNeighbors(ArrayList<Edge> graph[], int vertex) {
        for(int i=0; i<graph[vertex].size(); i++) {
            Edge e = graph[vertex].get(i);
            System.out.println(e.des);
        }
    }
    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        CreateGraph(graph);

        getNeighbors(graph, 2);
    }
}
