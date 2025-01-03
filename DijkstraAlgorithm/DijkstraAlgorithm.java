import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of vertices and edges
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        // Adjacency list to store the graph
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (format: source destination weight):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.get(source).add(new Node(destination, weight));
        }

        // Input the source vertex
        System.out.print("Enter the source vertex: ");
        int source = scanner.nextInt();

        // Run Dijkstra's Algorithm
        int[] distances = dijkstra(graph, source, vertices);

        // Print shortest distances
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To vertex " + i + ": " + distances[i]);
        }

        scanner.close();
    }

    public static int[] dijkstra(List<List<Node>> graph, int source, int vertices) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentVertex = current.vertex;

            for (Node neighbor : graph.get(currentVertex)) {
                int newDist = distances[currentVertex] + neighbor.weight;
                if (newDist < distances[neighbor.vertex]) {
                    distances[neighbor.vertex] = newDist;
                    pq.add(new Node(neighbor.vertex, newDist));
                }
            }
        }

        return distances;
    }
}

class Node {
    int vertex, weight;

    Node(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}
