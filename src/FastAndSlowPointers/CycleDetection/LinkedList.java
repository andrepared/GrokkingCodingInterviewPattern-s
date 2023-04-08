package FastAndSlowPointers.CycleDetection;

import java.util.*;

public class LinkedList
{
    public LinkedListNode head;

    public LinkedList()
    {
        this.head = null;
    }
    // insertNodeAtHead method will insert a LinkedList at head of LinkedList.
    public void insertNodeAtHead(LinkedListNode node)
    {
        if (this.head == null)
        {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }
    //createLinkedList method will create the linked list using the given integer array with the help of
    // insertAtHead method
    public void createLinkedList(int[] lst)
    {
        for (int i=lst.length -1;i>=0;i--)
        {
            LinkedListNode newNode = new LinkedListNode(lst[i]);
            insertNodeAtHead(newNode);
        }
    }
    // returns the number of nodes in a linked list
    public static LinkedListNode getNode(LinkedListNode head, int pos)
    {
        LinkedListNode ptr = head;
        if (pos != -1)
        {
            int p=0;

            while(p<pos)
            {
                ptr = ptr.next;
                p +=1;
            }

            return ptr;
        }
        return ptr;
    }
    // returns the node at the specific index (position) of the linked list
    public static int getLength(LinkedListNode head)
    {
        LinkedListNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
