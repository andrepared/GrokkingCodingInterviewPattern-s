package InPlaceReversalLL.ReverseLL.ReverseInKGroup;

import java.util.*;

public class LinkedList
{
    // template for creating LinkedList
    public LinkedListNode head;

    public LinkedList ()
    {
        this.head = null;
    }

    //insertNodeAtHead method
    public void insertNodeAtHead(LinkedListNode node)
    {
        if (this.head == null)
        {
            this.head = node;
        } else
        {
            node.next = this.head;
            this.head = node;
        }
    }
    // create_linked_list method will create the linked list using the
    // given integer array with the help of InsertAthead method.
    public void createLinkedList(List<Integer> lst) {
        for (int i = lst.size() - 1; i >= 0; i--) {
            LinkedListNode newNode = new LinkedListNode(lst.get(i));
            insertNodeAtHead(newNode);
        }
    }

}
