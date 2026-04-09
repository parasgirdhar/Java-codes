class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to delete last node
    void deleteLast() {
        // Case 1: Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // Case 3: More than one node
        Node temp = head;
        
        // Traverse to second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;
    }
}
