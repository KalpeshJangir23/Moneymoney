package arrays;

/**
 * add2number
 */
public class add2number {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder str = new StringBuilder();
        while (l1.next != null) {
            str.append(l1.val);
        }
        StringBuilder str2 = new StringBuilder();

        while (l2.next != null) {
            str2.append(l2.val);
        }

        int v1 = Integer.parseInt(str.toString());
        int v2 = Integer.parseInt(str2.toString());
        int val = v1 + v2;

        str.delete(0, str.length());
        str.append(val);
        str.reverse();
        int i = 0;
        ListNode resuNode = new ListNode();
        ListNode dummy = resuNode;
        while (i < str.toString().length()) {
            dummy.val = str.charAt(i);
            dummy = dummy.next;
            i++;
        }
        return dummy;
    }

    public static void main(String[] args) {
        
    }
}