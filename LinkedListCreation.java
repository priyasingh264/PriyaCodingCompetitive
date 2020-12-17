public class LinkedListCreation{
//Node class
    public static  class Node
    {
        int data;
        Node next=null;
        
        Node(int data)
        {
            this.data=data;;
            
        }
    }
    static Node head=null;
   static  Node tail=null;
    
    public static void insert(int data)
    {
        Node newnode=new Node(data);
        
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }
    public static void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
    }
    
    public static void main(String args[])
    {
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        display();
}

}
