package LinkedList.ProblemSet.Medium.NeetCode;

import LinkedList.ListNode;
import java.util.Arrays;

public class DeleteNodesFromLinkedListPresentInAnArray {
    public static ListNode modifiedList(int[] nums, ListNode head) {

        Arrays.sort(nums);

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (Arrays.binarySearch(nums, curr.val) >= 0) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Values to remove
        int[] nums = {1, 2, 3};

        System.out.println("Original linked list:");
        ListNode.ListNodeMethods.printList(head);

        head = modifiedList(nums, head);

        System.out.println("Modified linked list:");
        ListNode.ListNodeMethods.printList(head);
    }

}
