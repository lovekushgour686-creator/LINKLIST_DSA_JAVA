/*Given the head of two sorted linked lists consisting of nodes respectively. Merge both lists and return the head of the sorted merged list.

Examples:
Input:
  
Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:

Input:
Output: 1 -> 1 -> 2 -> 4
Explanation:
   */

import java.util.*;

class Node09 {
    int data;
    Node09 next;

    Node09(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program09 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("How many element in head1 enter it :: ");
        int s1 = cin.nextInt();
        System.out.println("How many element in head2 enter it :: ");
        int s2 = cin.nextInt();
        System.out.println("Write element in Head1");
        Node09 head1 = null;
        Node09 tail1 = null;
        LinkedList<Integer> List = new LinkedList<>();

        for (int i = 0; i < s1; i++) {
            int data = cin.nextInt();
            Node09 store = new Node09(data);
            if (head1 == null) {
                head1 = store;
                tail1 = store;
            } else {
                tail1.next = store;
                tail1 = store;
            }
        }
        System.out.println("Write element in head2 :: ");
        Node09 head2 = null;
        Node09 tail2 = null;
        for (int i = 0; i < s2; i++) {
            int element = cin.nextInt();
            Node09 store = new Node09(element);
            if (head2 == null) {
                head2 = store;
                tail2 = store;
            } else {
                tail2.next = store;
                tail2 = store;

            }
        }

        Node09 head3 = null;
        Node09 tail3 = null;

        while (head1 != null) {
            Node09 store = new Node09(head1.data);
            if (head3 == null) {
                head3 = store;
                tail1 = store;
            } else {
                tail1.next = store;
                tail1 = store;
            }
            head1 = head1.next;
        }
        while (head2 != null) {
            Node09 store = new Node09(head2.data);
            if (head3 == null) {
                head3 = store;
                tail1 = store;
            } else {
                tail1.next = store;
                tail1 = store;
            }
            head2 = head2.next;
        }
        System.out.println("Mege Singly Linked List : ------- >");

        while (head3 != null) {
            System.out.println(head3.data);
            head3 = head3.next;
        }

        cin.close();

    }
}
