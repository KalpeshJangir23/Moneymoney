package linked_list;

import java.util.*;

class ListNode {

  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class reverseLinkedList {

  public ListNode reverseList(ListNode head) {
    List<Integer> list = new ArrayList<>();
    ListNode curr = head;

    while (curr != null) {
      list.add(curr.val);
      curr = curr.next;
    }
    curr = head;
    Collections.reverse(list);

    int i = 0;
    while (i < list.size()) {
      curr.val = list.get(i);
      curr = curr.next;
      i++;
    }
    return curr;
  }
  public ListNode reverseLinkedList_Optimal_Approach1(ListNode head) {
    ListNode prev = null;
    ListNode temp = head;
    while(temp != null){ // prev -> temp -> front
                        // old      prev -> temp -> front
      ListNode front = temp.next;
      temp.next = prev;
      prev = temp;
      temp = front;
    }
    return prev;
  }
}
