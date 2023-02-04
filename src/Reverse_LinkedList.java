public class Reverse_LinkedList {
    public static void main(String[] args) {
    }

    //迭代法
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;// 保存下一个节点
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    //递归法
    public ListNode reverse(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }
        ListNode temp =null;
        temp = cur.next;
        cur.next = pre;
        return reverse(cur,temp);
    }

}
