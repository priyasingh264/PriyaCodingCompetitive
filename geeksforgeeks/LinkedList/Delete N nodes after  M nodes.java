//https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list
class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        Node curr=head;
        while(curr!=null)
        {
             for (int i = 1; i < M && curr != null; i++)  {
                curr=curr.next;
                
            }
            if(curr==null)
            {
                return;
            }
            Node temp=curr.next;
            
            for(int i=1;i<=N && temp!=null;i++)
            {
                temp=temp.next;
            }
            curr.next=temp; 
            curr=temp;
            
        }
    }
}


