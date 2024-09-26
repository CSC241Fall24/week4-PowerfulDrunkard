
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode current = head;
        for(int i = 0; i < position; i++){
        current=current.next;
        }
        ListNode insert = new ListNode(val);
        insert.next = current.next;
        current.next = insert;

        return head;
    }
}
