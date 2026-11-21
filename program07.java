/*Given the head of two sorted linked lists consisting of nodes respectively.
 Merge both lists and return the head of the sorted merged list.

Examples:

Input:
  
Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:
   
Input:
  
Output: 1 -> 1 -> 2 -> 4
Explanation:
   */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Node07 {
    int data;
    Node07 next;

    Node07(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program07 {
    public static void main(String[] args) {
        LinkedList<Integer> list07 = new LinkedList<>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Hoe many elment insert in Node 1 :: ");
        int s1 = cin.nextInt();
        int arr[] = new int[s1];
        System.out.println("How many element insert into Node 2 :: ");
        int s2 = cin.nextInt();
        int arr2[] = new int[s2];
        System.out.println("Write element in Node first :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Write element in Node Second :: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = cin.nextInt();
        }

        Node07 head = null;
        Node07 tail = null;

        for (int i = 0; i < (arr.length + arr2.length); i++) {
            if (i < arr.length) {
                Node07 store = new Node07(arr[i]);
                if (head == null) {
                    head = store;
                    tail = store;
                } else {
                    tail.next = store;
                    tail = store;
                }
            } else if ((i >= (arr.length)) && (i < (arr.length + arr2.length))) {
                Node07 store = new Node07(arr2[i - arr.length]);
                tail.next = store;
                tail = store;
            }

        }

        Node07 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            list07.add(temp.data);
            temp = temp.next;
        }
        System.out.println(list07);
        Collections.sort(list07);
        System.out.println(list07);
        cin.close();
    }
}
