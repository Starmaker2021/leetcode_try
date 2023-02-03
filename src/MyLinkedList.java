public class MyLinkedList {
    int size;
    LinkNode head;

    //head节点为虚拟节点
    public MyLinkedList() {
        size = 0;
        head = new LinkNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        LinkNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }

        LinkNode pre = head;

        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        LinkNode newNode = new LinkNode(val, pre.next);
        pre.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        LinkNode pred = head;
        for (int i = 0; i < index ; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}

class LinkNode {
    int val;
    LinkNode next;

    public LinkNode() {
    }

    public LinkNode(int val) {
        this.val = val;
    }

    public LinkNode(int val, LinkNode next) {
        this.val = val;
        this.next = next;
    }
}
