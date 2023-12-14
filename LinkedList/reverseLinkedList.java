package LinkedList;


public class reverseLinkedList {
    int val;
    reverseLinkedList next;
    reverseLinkedList() {}
    reverseLinkedList(int val) { this.val = val; }
    reverseLinkedList(int val, reverseLinkedList next) { this.val = val; this.next = next; }
}


class Solution {
    public reverseLinkedList reverseList(reverseLinkedList head) {
        reverseLinkedList newHead = null;
        while (head != null) {
            reverseLinkedList next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}