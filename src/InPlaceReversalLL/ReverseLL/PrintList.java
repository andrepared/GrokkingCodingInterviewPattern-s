package InPlaceReversalLL.ReverseLL;

public class PrintList
{
    public static void printListWithForwardArrow(LinkedListNode head)
    {
        LinkedListNode temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
            if (temp != null)
            {
                System.out.println("➡");
            }
        }
        // if this is the last node, print null at the end
        System.out.println("→ null");
    }
}
