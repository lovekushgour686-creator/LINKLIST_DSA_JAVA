/*You are given the head of two singly linked lists head1 and head2 representing two non-negative integers. 
You need to return the head of the linked list representing the sum of these two numbers.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list. */

// input :: (head 1)1->2->3->null
// (head2 ::) 9-.9-.9-> null

// output :: 1->1->->2->2->null;

import java.util.LinkedList;
import java.util.Scanner;

class Node08 {
    int data;
    Node08 next;

    Node08(int d) {
        data = d;
        next = null;
    }
}

public class program08 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("How many element you enter in Head1 :: ");
        int size = cin.nextInt();
        System.out.println("How many element you enter in Head1 :: ");
        int size2 = cin.nextInt();
        System.out.println("write integer in head1 ----------> ");
        for (int i = 0; i < size; i++) {
            int take = cin.nextInt();
            list1.add(take);
        }
        System.out.println("write integer in head2 ----------> ");
        for (int i = 0; i < size2; i++) {
            int take = cin.nextInt();
            list2.add(take);
        }
        System.out.println("--- Main Working --");
        Node08 head1 = null;
        Node08 tail1 = null;
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) != 0){
            Node08 store = new Node08(list1.get(i));
            if (head1 == null) {
                head1 = store;
                tail1 = store;
            } else {
                tail1.next = store;
                tail1 = store;
            }
        }
        }

        Node08 head2 = null;
        Node08 tail2 = null;
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i) != 0){
            Node08 store = new Node08(list2.get(i));
            if (head2 == null) {
                head2 = store;
                tail2 = store;
            } else {
                tail2.next = store;
                tail2 = store;
            }
        }
        }
        Node08 revhead1 = null;
        Node08 s1 = head1;
        Node08 revhead2 = null;
        Node08 s2 = head2;
        while (s1 != null) {
            Node08 t1 = s1.next;
            s1.next = revhead1;
            revhead1 = s1;
            s1 = t1;
        }
        while (s2 != null) {
            Node08 t2 = s2.next;
            s2.next = revhead2;
            revhead2 = s2;
            s2 = t2;
        }
        Node08 addhead1 = revhead1;
        Node08 addhead2 = revhead2;
        Node08 head3 = null;
        Node08 tail3 = null;
        int carray = 0;
        while (addhead1 != null || addhead2 != null) {
            
            int x = 0;
            int y = 0;
            if (addhead1 != null) {
                x = addhead1.data;
            }
            if (addhead2 != null) {
                y = addhead2.data;
            }
            int sum = x + y + carray;

            Node08 storerev = new Node08(sum % 10);
            if (head3 == null) {
                head3 = storerev;
                tail3 = storerev;
            } else {
                tail3.next = storerev;
                tail3 = storerev;
            }

            carray = sum / 10;
            if (addhead1 != null) {
                addhead1 = addhead1.next;
            }
            if (addhead2 != null) {
                addhead2 = addhead2.next;
            } }
        if (carray != 0) {
            Node08 storerev = new Node08(carray);
            tail3.next = storerev;
            tail3 = storerev;
        }
        Node08 head4 = null;
        Node08 second = head3;
        while (second != null) {
            Node08 temp = second.next;
            second.next = head4;
            head4 = second;
            second = temp;
        }
        while (head4 != null && head4.data == 0 && head4.next != null) {
            head4 = head4.next;

}
        Node08 rethead = head4;
        while (rethead != null) {
            System.out.print(rethead.data);
            rethead = rethead.next;
        }
        cin.close();
    }
}