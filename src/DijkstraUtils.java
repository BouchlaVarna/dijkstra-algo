import Objects.Edge;
import Objects.Node;

import java.util.LinkedList;
import java.util.List;

public class DijkstraUtils {

    private LinkedList<Node> nodeList = new LinkedList<>();
    private LinkedList<Edge> edgeList = new LinkedList<>();

    public LinkedList<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(LinkedList<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public LinkedList<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(LinkedList<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public void addNewNode(Node node) {
        nodeList.add(node);
    }

    public void addNewEdge(Edge edge) {
        edgeList.add(edge);
    }

    public void doDijkstra(Node startNode) {
        LinkedList<Node> currentNodes = new LinkedList<>();
        currentNodes.push(startNode);
        startNode.setValue(0);
        while (!currentNodes.isEmpty()) {
            Node currentNode = currentNodes.pop();
            List<Node> neighbours = findAllNeighbours(currentNode);
            currentNodes.addAll(neighbours);
            for (Node node : neighbours) {
                Edge edge = findEdge(node, currentNode);
                int totalSize = currentNode.getValue() + edge.getValue();
                if (node.getValue() > totalSize) {
                    node.setValue(totalSize);
                }
            }
            currentNode.setUsed(true);
        }
    }

    protected Edge findEdge(Node node, Node currentNode) {
        for (Edge edge : edgeList) {
            if (edge.getStartNode() == node && edge.getEndNode() == currentNode) return edge;
        }

        return null;
    }

    protected List<Node> findAllNeighbours(Node startNode) {
        List<Node> nodes = new LinkedList<>();

        for (Edge edge : edgeList) {
            if (edge.getStartNode() == startNode) nodes.add(edge.getStartNode());
        }

        return nodeList;
    }

    @Override
    public String toString() {
        return "DijkstraUtils{" +
                "nodeList=" + nodeList +
                ", edgeList=" + edgeList +
                '}';
    }
}
