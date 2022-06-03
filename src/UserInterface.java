import Objects.Edge;
import Objects.Node;

import java.util.Scanner;

public class UserInterface{

    PrintUtils printUtils = new PrintUtils();
    DijkstraUtils dijkstraUtils = new DijkstraUtils();
    Scanner sc = new Scanner(System.in);
    boolean isRunning = true;

    public void run() {
        Node node1 = new Node(5);
        Node node2 = new Node(6);
        Node node3 = new Node(7);
        Node node4 = new Node(8);
        Node node5 = new Node(9);
        Node node6 = new Node(10);
        Node node7 = new Node(15);
        Node node8 = new Node(2);
        Edge edge1 = new Edge(5);
        Edge edge2 = new Edge(5);
        Edge edge3 = new Edge(5);
        Edge edge4 = new Edge(5);
        Edge edge5 = new Edge(5);
        Edge edge6 = new Edge(5);
        Edge edge7 = new Edge(5);
        Edge edge8 = new Edge(5);
        edge1.setStartNode(node1);
        edge1.setEndNode(node2);
        edge2.setStartNode(node2);
        edge2.setEndNode(node3);
        edge3.setStartNode(node3);
        edge3.setEndNode(node4);
        edge4.setStartNode(node4);
        edge4.setEndNode(node5);
        edge5.setStartNode(node5);
        edge5.setEndNode(node6);
        edge6.setStartNode(node6);
        edge6.setEndNode(node7);
        edge7.setStartNode(node7);
        edge7.setEndNode(node8);
        edge8.setStartNode(node8);
        edge8.setEndNode(node4);
        dijkstraUtils.addNewNode(node1);
        dijkstraUtils.addNewNode(node2);
        dijkstraUtils.addNewNode(node3);
        dijkstraUtils.addNewNode(node4);
        dijkstraUtils.addNewNode(node5);
        dijkstraUtils.addNewNode(node6);
        dijkstraUtils.addNewNode(node7);
        dijkstraUtils.addNewNode(node8);
        dijkstraUtils.addNewEdge(edge1);
        dijkstraUtils.addNewEdge(edge2);
        dijkstraUtils.addNewEdge(edge3);
        dijkstraUtils.addNewEdge(edge4);
        dijkstraUtils.addNewEdge(edge5);
        dijkstraUtils.addNewEdge(edge6);
        dijkstraUtils.addNewEdge(edge7);
        dijkstraUtils.addNewEdge(edge8);

        while (isRunning) {
            printUtils.printCurrentNodes(dijkstraUtils.getNodeList());
            printUtils.printCurrentEdges(dijkstraUtils.getEdgeList());
            printUtils.printOptions();
            switch (sc.nextInt()) {
                case 1 -> createNewNode();
                case 2 -> createNewEdge();
                case 3 -> dijkstraUtils.doDijkstra(node1);
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
