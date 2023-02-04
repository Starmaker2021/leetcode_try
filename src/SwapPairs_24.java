import java.util.List;

public class SwapPairs_24 {
    //递归版
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newNode = swapPairs(next.next);
        next.next = head;
        head.next = newNode;

        return next;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode temp;
        ListNode firstnode;
        ListNode secondnode;
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;
            secondnode.next = firstnode;
            firstnode.next = temp;
            cur = firstnode;
        }
        return dummy.next;
    }

}

