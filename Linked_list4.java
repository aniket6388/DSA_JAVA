package DSA;

public class Linked_list4 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // Adding Node at First Position
    void addfirst(String data){
        Node newNode  = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Adding Node at Last Position
    void addlast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode  = currNode.next;
        }
        currNode.next = newNode;
    }
    //Deleting Node at first position
    void delete_first(){
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;
    }
    //Deleting Node at Last position
    void delete_last(){
        if(head == null){
            System.out.println("List is Already Empty");
            return;
        }
        if(head == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while(lastnode.next != null){
            secondlast = secondlast.next;
            lastnode = lastnode.next;
        }
        secondlast.next = null;
    }
    //Printing the List
    void printlist(){
        if(head == null){
            System.out.println("List is Empty");
        };
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode  = currNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String agrs[]){
        Linked_list4 list = new Linked_list4();
        
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("This");
        list.addlast("List");
        list.printlist();
        System.out.println();
        list.delete_first();
        list.printlist();
        System.out.println();
        list.delete_last();
        list.printlist();
    }  
}

