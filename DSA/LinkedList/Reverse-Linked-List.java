/*
Problem: Reverse a Singly Linked List
Platform: Standard
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Node {
    int val;
    Node next;
    Node(int val) { this.val = val; }
}

public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
