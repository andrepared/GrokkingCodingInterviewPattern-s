package FastAndSlowPointers.PalindromeLinkedList;

// class Palindrome List

public class main
{
    public static boolean palindrome(LinkedListNode head)
    {
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        LinkedListNode revertData = null;
        // Traverse linkedlist through fast and slow pointers to
        // get to the middle of the node
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static boolean compareTwoHalves(LinkedListNode firstHalf, LinkedListNode secondHalf)
    {
        while(firstHalf != null & secondHalf != null)
        {
            if(firstHalf.data != secondHalf.data)
            {
                return false;
            }
            else
            {
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
        }
        return true;
    }
        public static LinkedListNode reversedList(LinkedListNode slowPtr)
        {
            LinkedListNode reverse = null;
            while(slowPtr != null)
            {
                LinkedListNode next = slowPtr.next;
                slowPtr.next = reverse;
                reverse = slowPtr;
            }
            return reverse;
        }

    public static void main(String[] args) {

    }
}
