public class LinkedList {
    private Node head;

    private class Node {
        Barang data;
        Node next;

        Node(Barang data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Barang barang) {
        Node newNode = new Node(barang);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(String id) {
        if (head == null) {
            return;
        }
        if (head.data.id.equals(id)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.id.equals(id)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
