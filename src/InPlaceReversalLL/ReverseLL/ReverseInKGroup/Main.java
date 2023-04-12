package InPlaceReversalLL.ReverseLL.ReverseInKGroup;

public class Main
{
    public static LinkedListNode reverse(LinkedListNode head)
    {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        int index = 0;
        while(current != null)
        {
            index+=1;
            // temp store the next node
            next = current.next;
            // reverse the current node
            current.next = previous;
            // before we move to the next node, point prev
            // to curr node.
            previous = current;
            // move to next node
            current = next;

        }
        return previous;
    }
}
