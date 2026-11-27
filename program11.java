/*Sort Llinked List of 0s, 1s and 2s
Difficulty: MediumAccuracy: 60.75%Submissions: 312K+Points: 4Average Time: 30m
Given a linked list where nodes can contain values 0s, 1s, and 2s only.
Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s,
and all 2s are placed at the end.


Examples:

Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2

Explanation: All the 0s are segregated to the left end of the linked list,
 2s to the right end of the list, and 1s in between. The final list will be:
 */

import java.util.ArrayList;
import java.util.Scanner;

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program11 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter size of array :: ");
        int s = cin.nextInt();
        int arr[] = new int[s];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        Node11 head = null;
        Node11 tail = null;

        for (int i : arr) {
            Node11 store = new Node11(i);
            if (head == null) {
                head = store;
                tail = store;
            } else {
                tail.next = store;
                tail = store;
            }
        }
        ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> list011 = new ArrayList<>();

        while (head != null) {
            list11.add(head.data);
            head = head.next;
        }

        int z = 0;
        int o = 0;

        for (int i = 0; i < list11.size(); i++) {
            if (list11.get(i) == 0) {
                z++;
            } else if (list11.get(i) == 1) {
                o++;
            }

        }

        for (int i = 0; i < list11.size(); i++) {
            if (z > 0) {
                list011.add(0);
                z--;
            } else if (o > 0) {
                list011.add(1);
                o--;
            } else {
                list011.add(2);

            }
        }
        System.out.println(list011);

        Node11 h11 = null;
        Node11 t11 = null;

        for (int i = 0; i < arr.length; i++) {
            Node11 store = new Node11(list011.get(i));
            if (h11 == null) {
                h11 = store;
                t11 = store;
            } else {
                t11.next = store;
                t11 = store;
            }
        }
        cin.close();

    }
}
