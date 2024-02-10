package DSA;
public class Linked_list2 {
    node head;
    class node{
        String data;
        node next;
        node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // Adding in the first position
    public void Addfirst(String data){
        node Newnode = new node(data);
        if(head == null){
            head=Newnode;
            return;
        }
        Newnode.next = head;
        head = Newnode;
    }
    // Adding in  the Last position
    public void Addlast(String data){
        node Newnode = new node(data);
        if(head == null){
            head = Newnode;
            return;
        }
        node currNode = head;
        while(currNode.next!=null){
            currNode  =currNode.next;
        }
        currNode.next = Newnode;
    }
    // printing the list
    public void Printlist(){
        if(head == null){
            System.out.println("List is Empty");
        }
        node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " ");
            currNode  = currNode.next;
        }
    }
    public static void main(String args[]) {
        Linked_list2 list = new Linked_list2();
        list.Addfirst("a");
        list.Addfirst("is");
        list.Addfirst("This");
        list.Addlast("List");
        list.Printlist();
        
    }
}
