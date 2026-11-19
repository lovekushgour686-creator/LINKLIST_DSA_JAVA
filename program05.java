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

class Node05 {
    int data;
    Node05 next;

    Node05(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program05 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        Node05 head = null;
        Node05 tail = null;
        System.out.println("Write element for(add element in Linklist) by Array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
            Node05 store = new Node05(arr[i]);
            if (head == null) {
                head = store;
                tail = store;
            } else {
                tail.next = store;
                tail = store;
            }
        }
        LinkedList<Integer> List05 = new LinkedList<>();
        Node05 claim = head;
        while (claim != null) {
            List05.add(claim.data);
            claim = claim.next;
        }

        System.out.println("Reverse LinkedList ------------- > ");
        for (int i = 0; i < List05.size(); i++) {
            System.out.print(List05.get(List05.size() - i - 1));

            if ((List05.size() - 1) != i) {
                System.out.print("->");
            }
        }

        cin.close();
    }
}
