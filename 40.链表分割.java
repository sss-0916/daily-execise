import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        
        ListNode smallHead = new ListNode(-1);
        ListNode largeHead = new ListNode(-1);
        ListNode smallTail = smallHead, largeTail = largeHead;
        for (ListNode curNode = pHead; curNode != null; curNode = curNode.next) {
            if (curNode.val < x) {
                smallTail.next = curNode;
                smallTail = curNode;
            } else {
                largeTail.next = curNode;
                largeTail = curNode;
            }
        }
        largeTail.next = null;
        smallTail.next = largeHead.next;
        
        return smallHead.next;
    }
}