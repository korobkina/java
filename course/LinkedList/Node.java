package eiden.LinkedList;

public class Node {
    public int item;
    public Node next;
    public Node previous;

    Node(Node previous, int element, Node next) {
        this.item = element;
        this.next = next;
        this.previous = previous;
    }
}
