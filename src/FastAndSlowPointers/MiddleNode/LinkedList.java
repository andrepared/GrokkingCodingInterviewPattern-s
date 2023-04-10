package FastAndSlowPointers.MiddleNode;
import java.util.*;
// template for the linkedlist class
public class LinkedList <T>
{
    public LinkedListNode head;
    // constructor for linkedist

    public LinkedList()
    {
        this.head = null;
    }

    // create method for inseretingAtHead
    public void insertAtHead(LinkedList node)
    {
        if (this.head == null)
        {
            this.head = node;
        }
    }
}
