package DSA;
public class Linked_list {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void addfirst(int d){
        Node  newnode = new Node(d);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void Printlist(){
        if(head == null){
            System.out.println("List is Empty");
        };
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode  = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.Printlist();
        list.addfirst(4);
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.Printlist();
    }
}
