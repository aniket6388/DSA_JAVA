package DSA;

public class Linked_list3 {
    node head;

    class node {
        int data;
        node next;
        node prev;

        node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }
    void addfirst(int d) {
        node newnode = new node(d);
        if (head == null) {
            head = newnode ;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    public void Printlist() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        node last = head;
        while (last != null) {
            System.out.print(last.data + "-->");
            last = last.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Linked_list3 list = new Linked_list3();
        list.addfirst(9);
        list.addfirst(6);
        System.out.println("Hola!");
        list.Printlist();
    }
}
