// 142. Linked List Cycle II
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode ptr = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                while(slow != ptr){
                    slow = slow.next;
                    ptr = ptr.next;
                }
                return slow;
            }
        }
        return null;
    }
}
