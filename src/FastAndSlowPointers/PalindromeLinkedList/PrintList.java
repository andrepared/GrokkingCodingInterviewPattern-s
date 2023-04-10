package FastAndSlowPointers.PalindromeLinkedList;

public class PrintList
{
    public static void printListWithForwardArrow(LinkedListNode head)
    {
        LinkedListNode temp = head;

        while(temp != null)
        {
            System.out.println(temp.data); // print node value
            temp = temp.next;
            if (temp != null)
            {
                System.out.println(" ➡ ");
            }
            else
            {
                System.out.println(" ➡ null\n");
            }
        }
    }
}
