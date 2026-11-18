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

---

## 🛠️ How to Compile and Run

To run this program locally on your system:

1. **Compile the Java File:**
   ```bash
   javac program01.java
