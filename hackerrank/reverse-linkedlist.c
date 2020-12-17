

// Complete the reverse function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* reverse(SinglyLinkedListNode* head) 
{
    //next pointers 
        SinglyLinkedListNode *current = head; 
        SinglyLinkedListNode *prev = NULL, *next = NULL; 
  
  
        while (current != NULL) 
        { 
            // Store next 
            next = current->next; 
  
            // Reversing the data
            current->next = prev; 
  
            // Move pointers one position ahead. 
            prev = current; 
            current = next; 
        } 
        head = prev; 
    return head;

}

