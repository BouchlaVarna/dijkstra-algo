package Objects;

import java.util.LinkedList;
import java.util.List;

public class Node {

    private int value;
    private boolean used;
    private List<Edge> edgeList = new LinkedList<>();

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void addEdge(Edge edge) {
        edgeList.add(edge);
    }

    public List<Edge> getEdges() {
        return edgeList;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
