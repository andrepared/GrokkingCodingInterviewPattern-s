package FastAndSlowPointers.CycleDetection;

public class CycleDetection
{
        public static boolean detectCycle(LinkedListNode head)
        {
            if(head == null)
            {
                return false;
            }
            // Initialize two pointers, slow and fast, to the head of the linkedlist
            LinkedListNode slowPointer = head;
            LinkedListNode fastPointer = head;

            // Run the loop until we reach the end of the linked list or find a cycle
            while (fastPointer != null && fastPointer.next != null)
            {
                slowPointer = slowPointer.next;
                // Move the fast pointer two steps at a time
                fastPointer = fastPointer.next.next;

                // if there is a cycle, the slow and fast pointers will meet
                if (slowPointer == fastPointer)
                {
                    return true;
                }
            }
            // If we reach the end of the linked list and haven't found a cycle, return False
            return false;
        }

    public static void main(String[] args) {

    }
}
