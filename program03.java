
/*You are given the head of a linked list, You have to return the value of the middle node of the linked list.

If the number of nodes is odd, return the middle node value.
If the number of nodes is even, there are two middle nodes, so return the second middle node value.
Examples:

Input: 
   1->2->3->4->5
Output: 3
Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
 */

import java.util.Scanner;

class Node03 {
    int data;
    Node03 next;

    Node03(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program03 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of arrray :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }

        Node03 head = null;
        Node03 tail = null;

        for (int i = 0; i < arr.length; i++) {
            Node03 store = new Node03(arr[i]);

            if (head == null) {
                head = store;
                tail = store;
            } else {
                tail.next = store;
                tail = store;
            }

        }
        System.out.println("LinkedList ----------- >");
        Node03 claim = head;
        int digit = 0;
        while (claim != null) {
            digit++;
            claim = claim.next;
        }
        System.out.println("digit :: " + digit);
        int c = 0;
        Node03 claims = head;
        if ((digit & 1) != 0) {
            while (claims != null) {
                c++;
                if (((digit / 2) + 1) == c) {
                    System.out.print(claims.data + " ");
                    break;
                }
                claims = claims.next;
            }
        } else {
            while (claims != null) {
                c++;
                if (((digit / 2) + 1) == c) {
                    System.out.print(claims.data + " ");
                    break;
                }
                claims = claims.next;
            }
        }
        cin.close();

    }
}
