
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        //basecase for if l1 is empty
        if (l1 == null) {
            return l2;}
        //basecase for if l2 is empty
        if (l2 == null) {
            return l1;}
        ListNode currentl1=l1;
        ListNode currentl2=l2;
        //finds the tail node of l1 and sets currentl1 to it
        while (currentl1.next != null) {
            currentl1 = currentl1.next;
        }
        //Cycles through the l2 clone current l2 and makes a copy of each node to attach to currentl1, the tail of l1
        while(currentl2 != null){
            currentl1.next=new ListNode(currentl2.val);
            currentl2=currentl2.next;
            currentl1=currentl1.next;
        }
        return l1;
    }
}