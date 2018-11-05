package eiden.LinkedList;

public class LinkedList{
    private int size;

    private Node first;
    private Node last;

    public LinkedList() {
    }

    int unlink(Node node) {
        final int element = node.item;
        final Node next = node.next;
        final Node previous = node.previous;

        if (previous == null) {
            first = next;
        } else {
            previous.next = next;
            node.previous = null;
        }

        if (next == null) {
            last = previous;
        } else {
            next.previous = previous;
            node.next = null;
        }

        node.item = 0;
        size--;
        return element;
    }

    public void add(int elem) {
        final Node l = last;
        final Node newNode = new Node(l, elem, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;

    }

    public boolean remove(int elem) {
        try {
        if (elem == 0) {
            for (Node node = first; node != null; node = node.next) {
                if (node.item == 0) {
                    unlink(node);
                    return true;
                }
            }
        } else {
            for (Node node = first; node != null; node = node.next) {
                if (elem == node.item) {
                    unlink(node);
                    return true;
                }
            }
        }
        } catch (IllegalArgumentException s) {
            System.out.println(s);
        }
        return false;
    }


    public void removeAll() {
        for (Node node = first; node != null; ) {
            Node next = node.next;
            node.item = 0;
            node.next = null;
            node.previous = null;
            node = next;
        }
        first = last = null;
        size = 0;
    }
    public int getData(Node node) {
        return node.item;
    }
    public void print(LinkedList list){

        for (Node node = first; node != null; ) {
            Node next = node.next;
            System.out.println(getData(node));
            node = next;

        }
    }

}




