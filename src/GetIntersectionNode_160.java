public class GetIntersectionNode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        while (curA != null) {
            curA = curA.next;
            lenA++;
        }
        while (curB != null) {
            curB = curB.next;
            lenB++;
        }
        ;
        curA = headA;
        curB = headB;

        if (lenA < lenB) {
            int tempLen = lenB;
            lenB = lenA;
            lenA = tempLen;

            ListNode tempNode = curB;
            curB = curA;
            curA = tempNode;
        }

        int gap = lenA - lenB;
        while (gap > 0) {
            curA = curA.next;
            gap--;
        }
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
