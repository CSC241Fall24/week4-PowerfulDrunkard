
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        //create a new node with the given value
        ListNode insert = new ListNode(val);
        //check to make sure the NodeList isn't empty
        if(head==null){
            return new ListNode(val);}
        //basecase if it is put first
        if(position == 1){
            insert.next=head;
            return insert;
        }
        //cycles through and finds specified position
        ListNode current = head;
        for(int i = 1; i < position-1; i++){
        if(current.next != null){
        current=current.next;
        }
        }
        //links the previous positions next to insert, and links insert to the previous position 
        insert.next = current.next;
        current.next = insert;
        //returns modified linked list
        return head;
    }
}
