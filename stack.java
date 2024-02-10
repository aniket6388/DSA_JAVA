package DSA;
public class stack {
    int top;
    int max;
    int[] a;
    stack(int size) {
        max = size;
        top = -1;
        a = new int[max];
    }
    void push(int ele) {
        if (top == max - 1) {
            System.out.println("stack is overflow");
            return;
        }
        top++;
        a[top] = ele;
    }
    void pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
            return;
        }
        System.out.println("Deleted element is " + a[top]);
        top--;
    }
    void printlist() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }
    void peek() {
        System.out.println("peek element of stack is" + a[top]);
    }
    boolean isFull() {
        if (top == max - 1)
            return true;
        else
            return false;
    }
    boolean isempty() {
        if (top == -1)
            return true;
        else
            return false;
    }
    void search(int e){
        for(int i=0;i<max;i++){
            if(a[i] == e){
                System.out.println("Found at position " +i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        stack s = new stack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.isFull());
        s.printlist();
        s.pop();
        s.printlist();
        s.peek();
        s.search(4);
    }
}