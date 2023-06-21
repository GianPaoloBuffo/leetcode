package twoHundredSix_reverseLinkedList;

import util.ListNode;

public class Solution {

    public static ListNode reverseListIterative(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null) return null;
        return swap(null, head);
    }

    private static ListNode swap(ListNode prev, ListNode curr) {
        if (curr == null) return prev;

        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        return swap(prev, curr);
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2));
        System.out.println(reverseListRecursive(list));
    }
}
