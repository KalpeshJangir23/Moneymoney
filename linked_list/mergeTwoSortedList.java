package linked_list;

public class mergeTwoSortedList {

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

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyNode = new ListNode(-1);
    ListNode merge = dummyNode;

    ListNode h1 = list1;
    ListNode h2 = list2;

    while (h1 != null && h2 != null) {
        if (h1.val <= h2.val) {
            merge.next = h1;
            h1 = h1.next;
        } else {
            merge.next = h2;
            h2 = h2.next;
        }
        merge = merge.next; 
    }

    if (h1 != null) {
        merge.next = h1;
    } else {
        merge.next = h2;
    }

    return dummyNode.next;
  }
}
