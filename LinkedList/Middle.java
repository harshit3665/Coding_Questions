import java.util.LinkedList;

public class Middle {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Middle sol = new Middle(); // First, create object of outer class

        // Now use it to create nodes using non-static inner class
        Node head = sol.new Node(1);
        head.next = sol.new Node(2);
        head.next.next = sol.new Node(3);
        head.next.next.next = sol.new Node(4);
        head.next.next.next.next = sol.new Node(5);

        int middle = sol.getMiddle(head);

        System.out.println("Middle element: " + middle); // Output: 3
    }
}
