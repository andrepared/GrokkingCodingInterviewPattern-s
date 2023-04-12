package InPlaceReversalLL.ReverseLL;

import java.util.List;
import java.util.Arrays;

public class main
{
    public static LinkedListNode reverse(LinkedListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        LinkedListNode listToDo = head.next;
        LinkedListNode reversedList = head;
        reversedList.next = null;
        while(listToDo != null)
        {
            LinkedListNode temp = listToDo;
            listToDo = listToDo.next;
            temp.next = reversedList;
            reversedList = temp;
        }
        return reversedList;
    }

    public static void main(String[] args) {
        // Declaring and creating a linked list
        LinkedList obj1 = new LinkedList();
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // Creating Linked Lists
        obj1.createLinkedList(inputList);
        // Displaying original linked list
        System.out.print("The original linked list: ");
        PrintList.printListWithForwardArrow(obj1.head);
        LinkedListNode result = reverse(obj1.head);
        System.out.print("\n\nThe reversed linked list:  ");
        PrintList.printListWithForwardArrow(result);
    }
}
