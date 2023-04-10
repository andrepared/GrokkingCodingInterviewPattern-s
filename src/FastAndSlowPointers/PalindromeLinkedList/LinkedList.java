package FastAndSlowPointers.PalindromeLinkedList;

public class LinkedList<T>
{
    public LinkedListNode head;
    // constructor will be used to create LinkedList object
    public LinkedList()
    {
        this.head = null;
    }
    //insertNodeAtHead method will inset a LinkedListNode at head of a Linked List.
    public void insertAtHead(LinkedListNode node)
    {
        if(this.head == null)
        {
            this.head = node;
        }
        else
        {
            node.next = this.head;
            this.head = node;
        }
    }
    // create LinkedList method will create the linkedlist using the given integer array with the help of
    // the insertAtHead method.
    public void createLinkedList(int[] list)
    {
        for (int i = list.length-1;i>=0;i--)
        {
            LinkedListNode newNode = new LinkedListNode(list[i]);
            insertAtHead(newNode);
        }
    }
}
