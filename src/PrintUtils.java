import Objects.Edge;
import Objects.Node;

import java.util.LinkedList;
import java.util.List;

public class PrintUtils {

    public void printCurrentNodes(LinkedList<Node> nodes) {
        System.out.println("Current nodes: ");
        for (int i = 0; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            System.out.println(i + ". " + node);
        }
        System.out.println();
    }

    public void printCurrentEdges(LinkedList<Edge> edges) {
        System.out.println("Current edges: ");
        for (Edge edge : edges) {
            System.out.println(edge);
        }
        System.out.println();
    }

    public void printNodeCreation() {
        System.out.println("Enter value of the node");
    }

    public void printEdgeCreation() {
        System.out.println("Enter value of the edge");
        System.out.println("Afterwards enter a node as a starting point and a node as an ending point");
    }

    public void printOptions() {
        System.out.println("1. Add a new node");
        System.out.println("2. Add a new edge to existing node");
        System.out.println("3. Run dijkstra");
        System.out.println("4. Exit");
    }
}
