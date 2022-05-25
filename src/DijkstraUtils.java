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

    public void addNewNode() {

    }

    public void addNewEdge() {

    }

    @Override
    public String toString() {
        return "DijkstraUtils{" +
                "nodeList=" + nodeList +
                ", edgeList=" + edgeList +
                '}';
    }
}
