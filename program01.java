class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class program01 {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);

        n1.next = n2;

        Node temp = n1;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
