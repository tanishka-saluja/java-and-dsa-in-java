/*
Problem: Detect Cycle in Linked List
Platform: Standard
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Node {
    int val;
    Node next;
    Node(int val) { this.val = val; }
}

public class DetectCycle {
    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
