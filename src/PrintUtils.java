import Objects.Edge;
import Objects.Node;

import java.util.LinkedList;
import java.util.List;

public class PrintUtils {

    public void printCurrentNodes(LinkedList<Node> nodes) {
        System.out.println("Current nodes: ");
        for (Node node : nodes) {
            System.out.println(node.toString());
        }
        System.out.println("");
    }

    public void printCurrentEdges(LinkedList<Edge> edges) {
        System.out.println("Current edges: ");
        System.out.println("");
    }

    public void printOptions() {
        System.out.println("1. Add a new node");
        System.out.println("2. Add a new edge to existing node");
        System.out.println("3. Run dijkstra");
        System.out.println("4. Exit");
    }
}
