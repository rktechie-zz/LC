/*
 * Problem 141: Linked List Cycle
 * 
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space? 
 */

public class Problem141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
