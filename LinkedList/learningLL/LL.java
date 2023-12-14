package LinkedList.learningLL;

import java.util.HashSet;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    // constructor for size
    public LL() {
        this.size = 0;
    }

    public void insertATfirst(int val) {
        // create the node
        Node node = new Node(val);
        // assign the node value to point to the head
        node.next = head;
        // assign the new head
        head = node;

        if (tail == null) {
            tail = head;

        }
        size += 1;
    }

    public void insertATlast(int val) {
        // create a new node
        Node node = new Node(val);
        // base case = if list is empty
        if (tail == null) {
            insertATfirst(val);
        } else {
            // check for the tail node
            if (tail.next == null) {
                // assign the new node to the tail node
                tail.next = node;

                tail = node;
            } else {
                tail = tail.next;
            }
        }
        // assign the new tail node.next to the null
        node.next = null;

        // increaseing the size of LL (optional)
        size += 1;

    }

    public void insertATposition(int val, int position) {
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {

            node.next = temp.next;
            temp.next = node;
        }

        size += 1;
    }

    // insert using recursion
    public void insertUsingRecursion(int val, int index) {
        head = nodeRecursion(val, index, head);
    }

    private Node nodeRecursion(int val, int index, Node node) {

        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = nodeRecursion(val, index - 1, node.next);
        return node;
    }

    public int deleteATfirst() {
        int val = head.value;
        head = head.next;
        size -= 1;
        return val;
        // temp.next = null;
    }

    // remove duplicate from the LinkedList
    // LC 83
    public void removeDuplicate(LL list) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        Node current = list.head;
        Node prev = null;

        while (current != null) {
            int value = current.value;
            if (uniqueValues.contains(value)) {
                // This node is a duplicate, so remove it from the linked list
                prev.next = current.next;
            } else {
                // Add the value to the set of unique values and continue traversing
                uniqueValues.add(value);
                prev = current;
            }
            current = current.next;
        }
    }

    // with no extra space
    public void removeDuplicateValues() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public int deleteATlast() {
        int val = tail.value;
        Node node_secondLast = get(size - 2);
        node_secondLast.next = null;
        return val;
    }

    public int deleteATposition(int position) {
        int val = -1;
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        val = temp.value;
        Node previNode = get(position - 1);
        previNode.next = previNode.next.next;

        return val;
    }

    public void deleteNode(Node node) {

        Node temp = head;
        int size = 0;
        int position = 1;
        while (temp.next != null) {
            size += 1;
            temp = temp.next;
        }
        Node temp2 = head;
        for (int i = 0; i < size; i++) {
            if (temp2.value == node.value) {
                break;
            } else {
                position += 1;
                temp2 = temp2.next;
            }

        }
        Node previNode = get(position - 1);
        previNode.next = previNode.next.next;

    }



    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int middleNode(){
        int count = 1;
        Node temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        int answer = 0;
        Node ans = head;
        if (count%2 == 0 && count >0) {
            ans = get(count/2);
            answer = ans.next.value;
            
        } else {
            ans = get(count/2 -1); 
            answer = ans.value;
        }
         System.out.println(count);
        return answer;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
    }

   

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
