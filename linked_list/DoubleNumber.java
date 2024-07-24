package linked_list;

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

public class DoubleNumber {

  public ListNode doubleIt(ListNode head) {
    StringBuilder str = new StringBuilder();
    while (head.next != null) {
      str.append(head.val);
      head = head.next;
    }
    int val = Integer.parseInt(str.toString());
    val = val * 2;
    String s = String.valueOf(val);

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int i = 0;
    while (i < s.length()) {
      curr.next = new ListNode(s.charAt(i) - '0');
      curr = curr.next;
      i++;
    }
    return dummy.next;
  }
}
