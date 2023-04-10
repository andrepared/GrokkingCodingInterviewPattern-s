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


    public static void main(String args[]) {
        int[][] input = {{2, 4, 6, 8, 10, 12}, {1, 3, 5, 7, 9, 11},
                {0, 1, 2, 3, 4, 6}, {3, 4, 7, 9, 11, 17}, {5, 1, 4, 9, 2, 3}};
        int[] pos = {0, -1, 1, -1, 2};
//        for (int i = 0; i < input.length; i++) {
//            LinkedList < Integer > list = new LinkedList < Integer > ();
//            list.createLinkedList(input[i]);
//            System.out.println(i + 1 + ".\tInput:");
//            System.out.print("\t");
//            if (pos[i] == -1) {
//                PrintList.printListWithForwardArrow(list.head);
//            } else {
//                PrintList.printListWithForwardArrowLoop(list.head);
//            }
//            System.out.println("\n\tpos: " + pos[i]);
//
//            if (pos[i] != -1) {
//                int length = list.getLength(list.head);
//                LinkedListNode lastNode = list.getNode(list.head, length - 1);
//                lastNode.next = list.getNode(list.head, pos[i]);
//            }
//            System.out.println("\n\tDetected Cycle =  " + detectCycle(list.head));
//            System.out.println(new String(new char[100]).replace('\0', '-'));
//        }
    }
    }
