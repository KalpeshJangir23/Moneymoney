package LinkedList;



import org.w3c.dom.Node;

public class LC21 {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the code
        ListNode dummy = new ListNode();
        ListNode node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next; // Move the node pointer
        }

        // Append the remaining elements, if any
        if (list1 != null) {
            node.next = list1;
        }
        if (list2 != null) {
            node.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create two linked lists
        LC21 lc21 = new LC21();

        LC21.ListNode list1 = lc21.new ListNode(1); // Creating a new node with value 1
        list1.next = lc21.new ListNode(3); // Adding a node with value 3 to list1
        list1.next.next = lc21.new ListNode(5); // Adding a node with value 5 to list1

        LC21.ListNode list2 = lc21.new ListNode(2); // Creating a new node with value 2
        list2.next = lc21.new ListNode(4); // Adding a node with value 4 to list2
        list2.next.next = lc21.new ListNode(6); // Adding a node with value 6 to list2

        // Merge the two lists
        LC21.ListNode mergedList = lc21.mergeTwoLists(list1, list2);

        // Print the merged list
        LC21.ListNode temp = mergedList;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
    }
}

