
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;}
        if (l2 == null) {
            return l1;}
        ListNode currentl1 = l1;
        ListNode currentl2=l2;
        while (currentl1.next != null) {
            currentl1 = currentl1.next;
        }
        
        while(currentl2 != null){
            currentl1.next=new ListNode(currentl2.val);
            currentl2=currentl2.next;
            currentl1=currentl1.next;
        }
        return l1;
    }
}