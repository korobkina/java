package eiden.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.add(9);
        list.add(19);
        list.add(53);
        list.remove(9);
        list.print(list);
        list.removeAll();

    }
}


