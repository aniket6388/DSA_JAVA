package DSA;

public class stack2 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }

        // Push element to the top of the stack
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop an element from the top of the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Already empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.peek();
            while (!isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
