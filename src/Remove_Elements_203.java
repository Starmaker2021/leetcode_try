public class Remove_Elements_203 {
    public static void main(String[] args) {

    }

    //添加虚拟头结点
    public static ListNode removeElements(ListNode head, int target) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == target) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    //不添加虚拟节点，但是保留pre的方法
    public static ListNode removeElements2(ListNode head, int target) {
        while (head != null && head.val == target) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == target) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static ListNode removeElements3(ListNode head, int target) {
        while (head != null && head.val == target) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        while (cur != null) {
            while (cur.next.val == target&&cur.next!=null) {
                cur.next = cur.next.next;
            }
                cur = cur.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

