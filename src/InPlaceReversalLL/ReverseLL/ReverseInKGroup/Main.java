package InPlaceReversalLL.ReverseLL.ReverseInKGroup;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static List<LinkedListNode> reverse(LinkedListNode head, int k)
    {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        int index = 0;
        while(current != null)
        {

            // temp store the next node
            next = current.next;
            // reverse the current node
            current.next = previous;
            // before we move to the next node, point prev
            // to curr node.
            previous = current;
            // move to next node
            current = next;
            index+=1;
        }
        List<LinkedListNode> resultList = Arrays.asList(previous, current, next);
        return resultList;
    }
    public static int findLength(LinkedListNode start)
    {
        LinkedListNode current = start;
        int count =0;
        while(current != null)
        {
            current = current.next;
            count +=1;

        }
        return count;
    }
    public static LinkedListNode reversedLinkedList(LinkedListNode head, int k)
    {
        if(k<=1 || head == null)
            return head;

        int i=0;
        int count =0;
        LinkedListNode current = head;
        LinkedListNode previous = null;
        LinkedListNode lastNodeOfPreviousPart = null;
        LinkedListNode lastNodeOfCurrentPart = null;
        int totalLength = findLength(head);
        while(true)
        {
            i+=1;
            lastNodeOfPreviousPart = previous;
            lastNodeOfCurrentPart = current;
            LinkedListNode next = null;
            List<LinkedListNode> res = reverse(lastNodeOfCurrentPart, k);
            previous = res.get(0);
            current = res.get(1);
            next = res.get(2);
            count += k;
            if(lastNodeOfPreviousPart != null)
            {
                lastNodeOfPreviousPart.next = previous;
            }
            else
            {
                head = previous;

            }
            lastNodeOfCurrentPart.next = current;
            if (current == null || (totalLength - count) < k)
            {
                break;
            }
            previous = lastNodeOfCurrentPart

        }
        return head;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        LinkedList inputLinkedList = new LinkedList();
        inputLinkedList.createLinkedList(inputList);
        System.out.print("The original linked list: ");
        PrintList.printListWithForwardArrow(inputLinkedList.head);
        LinkedListNode result = reverseLinkedList(inputLinkedList.head, 3);
        System.out.print("\nReversed linked list, with k = " + 3 + ": ");
        PrintList.printListWithForwardArrow(result);
    }
}
