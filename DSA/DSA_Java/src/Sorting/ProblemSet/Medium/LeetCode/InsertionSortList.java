package Sorting.ProblemSet.Medium.LeetCode;
import LinkedList.ListNode;

public class InsertionSortList {

    public static int[] linkedListToArray(ListNode head) {
        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int[] arr = new int[size];

        curr = head;
        int i = 0;

        while (curr != null) {
            arr[i++] = curr.val;
            curr = curr.next;
        }

        return arr;
    }

    public static ListNode arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        int[] arr = linkedListToArray(head);
        insertSort(arr);
        return arrayToLinkedList(arr);
    }

    public static void main(String[] args) {
        ListNode four = new ListNode(4);
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1);
        ListNode three = new ListNode(3);

        four.next = two;
        two.next = one;
        one.next = three;

        ListNode head = four;

        System.out.println("Original list:");
        ListNode.ListNodeMethods.printList(head);

        head = insertionSortList(head);

        System.out.println("Sorted list:");
        ListNode.ListNodeMethods.printList(head);
    }
}
