/*Given the head of a singly linked list. Reverse the linked list .
Examples:
Input:
Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linked list
Input: 
Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list
Input: 
Output: 8
Explanation:
 */

import java.util.LinkedList;
import java.util.Scanner;
class Node06 {
    int data;
    Node06 next;

    Node06(int data) {
        this.data = data;
        this.next = null;
    }
}
public class program06 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        LinkedList<Integer> List06 = new LinkedList<>();
        int arr[] = new int[size];
        Node06 head = null;
        Node06 tail = null;
        System.out.println("Write element for(add element in Linklist) by Array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
            Node06 store = new Node06(arr[i]);
            if (head == null) {
                head = store;
                tail = store;
            } else {
                tail.next = store;
                tail = store;
            }
        }

        Node06 claim = head;

        while (claim != null) {
            List06.add(claim.data);
            claim = claim.next;
        }

        Node06 h = null;
        Node06 t = null;

        for (int i = 0; i < List06.size(); i++) {
            Node06 Storevalue = new Node06(List06.get(List06.size() - 1 - i));
            if (h == null) {
                h = Storevalue;
                t = Storevalue;
            } else {
                t.next = Storevalue;
                t = Storevalue;
            }
        }
        Node06 claims = h;

        while (claims != null) {
            System.out.println(claims.data);
            claims = claims.next;
        }
cin.close();
    }
}