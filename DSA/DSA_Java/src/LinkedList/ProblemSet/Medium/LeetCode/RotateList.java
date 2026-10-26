package LinkedList.ProblemSet.Medium.LeetCode;

import LinkedList.ListNode;

public class RotateList {
    public static ListNode swap(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 0; i < left-1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dummy.next;
    }

    public static int getLength(ListNode head) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int n = getLength(head);
        k %= n;

        if (k == 0) {
            return head;
        }

        head = swap(head, 1, n);
        head = swap(head, 1, k);
        head = swap(head, k + 1, n);

        return head;
    }

    public static void main(String[] args){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode.head = one;

        ListNode.ListNodeMethods.printList(ListNode.head);

        ListNode.head = rotateRight(ListNode.head,3);

        ListNode.ListNodeMethods.printList(ListNode.head);
    }
}
