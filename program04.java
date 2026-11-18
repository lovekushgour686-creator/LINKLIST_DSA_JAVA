/*You are given the head of a singly linked list of positive integers. You have to check if the given linked list is palindrome or not.

Examples:

Input:
   
Output: true
Explanation: The given linked list is 1 -> 2 -> 1 -> 1 -> 2 -> 1, which is a palindrome.
Input:
   
Output: false
Explanation: The given linked list is 10 -> 20 -> 30 -> 40 -> 50, which is not a palindrome. */

import java.util.Scanner;

class Node04 {
    int data;
    Node04 next;

    Node04(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program04 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];

        System.out.println("Write element in array :: ");
        Node04 head = null;
        Node04 tail = null;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            length++;
            Node04 store = new Node04(arr[i]);
            if (head == null) {
                head = store;
                tail = store;
            } else {
                tail.next = store;
                tail = store;
            }
        }
        Node04 claim = head;
        int pal[] = new int[length];
        int ind = 0;
        System.out.println("====================================");
        while (claim != null) {
            pal[ind] = claim.data;
            ind++;
            claim = claim.next;
        
        }
        for(int i =0;i<pal.length;i++)
        {
         System.out.println(pal[i]);
        }
        boolean r = true;
        for (int i = 0; i < pal.length / 2; i++) {
            if (pal[i] != pal[pal.length - 1 - i]) {
                r = false;
                break;
            }
        }
        if (r) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        cin.close();
    }
}
