package Objects;

public class Edge {

    private int value;
    private Node startNode;
    private Node endNode;

    public Edge(int value, Node startNode, Node endNode) {
        this.value = value;
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public Edge(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "value=" + value +
                ", startNode=" + startNode +
                ", endNode=" + endNode +
                '}';
    }
}
