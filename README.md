## Singly Linked List Operations

Welcome to the **Java Singly Linked List Operations** repository! This repository contains foundational Java programs focused on node creation, memory referencing, pointer manipulation, and traversal algorithms.

---

#---> Program Catalog

| File Name | Program Description | Operational Logic |
| :--- | :--- | :--- |
| `program01.java` | Singly Linked List Creation & Traversal | Defines a custom `Node` class containing an integer data field (`data`) and a reference pointer (`next`), manually instantiates sequential nodes (`n1` and `n2`), links them via `n1.next = n2`, and utilizes a temporary tracking pointer (`temp`) in a `while` loop to traverse and print each element's value. |
| `program02.java` | Array to Singly Linked List Converter | Accepts a user-defined array size and elements via `Scanner`, dynamically constructs a linked list by instantiating `Node02` objects while maintaining `head` and `tail` pointers, and traverses the list to print elements formatted with directional arrows (`-->`)[cite: 2]. |
| `program03.java` | Middle Node Finder in Singly Linked List | Accepts array input to build a singly linked list with `Node03` elements, counts total node length via traversal, and computes/prints the middle node's value (returning the second middle node for even-length lists)[cite: 4]. |
| `program04.java` | Singly Linked List Palindrome Checker | Accepts an array of positive integers, dynamically constructs a linked list using `Node04` elements with `head` and `tail` tracking, copies linked list values into an integer array (`pal[]`), and uses a two-pointer validation loop to verify if the sequence is a palindrome, printing "True" or "False"[cite: 3, 5]. |
| `program05.java` | Singly Linked List Reversal | Reads array elements to build a singly linked list of `Node05` nodes with `head` and `tail` pointers, transfers node values into a `LinkedList<Integer>`, and prints the elements in reverse order separated by `->`[cite: 6]. |
| `program06.java` | Singly Linked List Reversal (New Linked List Construction) | Reads array elements to build a singly linked list of `Node06` nodes with `head` and `tail` pointers, extracts node values into a `LinkedList<Integer>`, constructs a new reversed linked list (`h` and `t` pointers) from elements in reverse order, and traverses the reversed list to print each node's data[cite: 7]. |
| `program07.java` | Merge Two Sorted Linked Lists | Reads two input arrays (`arr[]` and `arr2[]`), constructs a combined singly linked list of `Node07` elements using `head` and `tail` pointers, traverses the list to print node values and store them in a `LinkedList<Integer>`, and sorts the collected list via `Collections.sort()`[cite: 8]. |
| `program08.java` | Sum of Two Numbers Represented as Linked Lists | Reads integer inputs into two lists (`list1` and `list2`), builds `Node08` linked lists (`head1` and `head2`), reverses both lists in-place (`revhead1` and `revhead2`), adds corresponding digits along with carry (`carray`) into a new list (`head3`), reverses the result back (`head4`), strips leading zeros, and prints the final sum digits[cite: 9]. |
| `program09.java` | Linked List Concatenation from Two Lists | Reads element counts and values to construct two separate `Node09` linked lists (`head1` and `head2`), iterates through both lists to append new `Node09` nodes into a combined chain (`head3`), and traverses `head3` to print each element[cite: 10]. |
| `program10.java` | Left Rotate Singly Linked List by K Positions | Reads integer inputs into a `LinkedList`, constructs a `Node10` singly linked list (`head` and `tail`), extracts values into a list, normalizes rotation count `R` modulo list size (`start = R % List.size()`), builds a left-rotated `Node10` list (`returhead` and `tail1`), and prints the rotated nodes followed by `Null`[cite: 11] |
---

## 🛠️ How to Compile and Run

To run this program locally on your system:

1. **Compile the Java File:**
   ```bash
   javac program01.java
