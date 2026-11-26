import java.util.LinkedList;
import java.util.Scanner;

/*You are given the head of a singly linked list, you have to left rotate the linked list k times. 
Return the head of the modified linked list. */
class Node10 {
    int data;
    Node10 next;

    Node10(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter size of Head :: ");
        int size = cin.nextInt();
        System.out.println("Write integer ------->");
        for (int i = 0; i < size; i++) {
            int x = cin.nextInt();
            list.add(x);
        }

        Node10 head = null;
        Node10 tail = null;
        for (int i = 0; i < list.size(); i++) {
            Node10 store = new Node10(list.get(i));
            if (head == null) {
                head = store;
                tail = store;
            } else {
                tail.next = store;
                tail = store;
            }
        }
        LinkedList<Integer> List = new LinkedList<>();

        Node10 claim = head;
        while (claim != null) {

            List.add(claim.data);
            claim = claim.next;
        }
        System.out.println("Enter Rotate Positon :: ");
        int R = cin.nextInt();
        int start = R % List.size();

        Node10 returhead = null;
        Node10 tail1 = null;
        for (int i = 0; i < List.size(); i++) {
            if (i < (List.size() - start)) {
                Node10 stored = new Node10(List.get(start + i));
                if (returhead == null) {
                    returhead = stored;
                    tail1 = stored;
                }
                else
                {
                    tail1.next = stored;
                    tail1 = stored;
                }
            } else if (i >= (List.size() - start)) {
                Node10 stored = new Node10(List.get(i - (List.size() - start)));
                tail1.next = stored;
                tail1 = stored;
            }
        }

        Node10 claimed = returhead;
        while (claimed != null) {
            System.out.print(claimed.data + " -> ");
            claimed = claimed.next;
        }
        System.out.print("Null");
        cin.close();
    }

}
