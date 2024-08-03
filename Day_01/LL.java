package Day_01;

public class LL {
    Node head;
    private int size;

    public LL() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void remove() {
        if (head == null) {
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;

        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public void getSize() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.printList();
        list.getSize();
        list.remove();
        list.printList();
        list.getSize();
    }
}
