/*You are given an array arr[] of integers. You have to construct a singly linked list from the elements of the arr[] and return the head of the linked list.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 -> 2 -> 3 -> 4 -> 5 
Explanation: Linked list for the given array will be, */

import java.util.Scanner;

class Node02 {
    int data;
    Node02 next;

    Node02(int data) {
        this.data = data;
        this.next = null;
    }
}

public class program02 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }

        System.out.println("Insert element in Linklist");
        Node02 head = null;
        Node02 tail = null;
        for (int i = 0; i < arr.length; i++) {

            Node02 newnode = new Node02(arr[i]);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;

            }

        }
int a = arr.length;
        Node02 current = head;
        while (current != null) {
            System.out.println(current.data);
       if(1 != a )
       {
        System.out.print("-->");
       }
            current = current.next;
            a--;
            
        }

        cin.close();

    }
}
