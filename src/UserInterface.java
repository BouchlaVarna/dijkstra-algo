import Objects.Edge;
import Objects.Node;

import java.util.Scanner;

public class UserInterface{

    PrintUtils printUtils = new PrintUtils();
    DijkstraUtils dijkstraUtils = new DijkstraUtils();
    Scanner sc = new Scanner(System.in);
    boolean isRunning = true;

    public void run() {

        while (isRunning) {
            printUtils.printCurrentNodes(dijkstraUtils.getNodeList());
            printUtils.printCurrentEdges(dijkstraUtils.getEdgeList());
            printUtils.printOptions();
            switch (sc.nextInt()) {
                case 1 -> createNewNode();
                case 2 -> createNewEdge();
                case 3 -> System.out.println("TODO");
                case 4 -> isRunning = false;
            }
        }
    }

    public void createNewNode() {
        printUtils.printNodeCreation();
        Node node = new Node(sc.nextInt());
        dijkstraUtils.addNewNode(node);
    }

    public void createNewEdge() {
        printUtils.printEdgeCreation();
        Edge edge = new Edge(sc.nextInt());
        printUtils.printCurrentNodes(dijkstraUtils.getNodeList());

        dijkstraUtils.addNewEdge(edge);
    }
}
