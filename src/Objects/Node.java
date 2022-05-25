package Objects;

import java.util.LinkedList;
import java.util.List;

public class Node {

    private int value;
    private LinkedList<Edge> edges;
    private boolean used;

    public Node(int value, LinkedList<Edge> edges) {
        this.value = value;
        this.edges = edges;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(LinkedList<Edge> edges) {
        this.edges = edges;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", edges=" + edges +
                '}';
    }
}
