package DSA;
public class double_LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
    
    Node (int d){
        data = d;
        next = null;
        prev = null;
    }
    }
    void addfirst(int d){
        Node newnode = new Node(d);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    void addlast(int d){
        Node newnode = new Node(d);
        if(head == null){
            head = newnode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        
    }
    void delete_first(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
}
