
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode insert = new ListNode(val);
        if(head==null){
            return new ListNode(val);}
        if(position == 1){
            insert.next=head;
            return insert;
        }
        ListNode current = head;
        for(int i = 2; i < position; i++){
        if(current.next != null){
        current=current.next;
        }
        }
        insert.next = current.next;
        current.next = insert;
        return head;
    }
}
