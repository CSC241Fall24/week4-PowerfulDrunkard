
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        //get last node of l1
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        while(l2 != null){
            current.next=new ListNode(l2.val);
        }
        return l1;
    }
}