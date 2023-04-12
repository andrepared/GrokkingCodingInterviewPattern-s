package InPlaceReversalLL.ReverseLL;

import java.util.List;

public class LinkedList
{
    public LinkedListNode head;
    // Linked List will be used to make a LinkedList type Object
    public LinkedList()
    {
        this.head = null;
    }
    public LinkedList(List<Integer> inputList)
    {
        createLinkedList(inputList);
    }

    //insertNodeAtHead will be helper function
    public void insertNodeAtHead(LinkedListNode node)
    {
        if (this.head == null)
        {
            this.head = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
    }
    // create linked_list method will create a linked list using
    // given integer array with the help of insertAtHead method
    public void createLinkedList(List<Integer> list)
    {
        for(int i=list.size()-1;i>=0;i--)
        {
            LinkedListNode newNode = new LinkedListNode(list.get(i));
            insertNodeAtHead(newNode);
        }
    }
}
