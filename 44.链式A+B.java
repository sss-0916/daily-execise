import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;
         
        ListNode dummyNode = new ListNode(-1);
        ListNode tailNode = dummyNode;
        int carry = 0;
        ListNode curA = a, curB = b;
        while (curA != null || curB != null || carry != 0) {
            int num1 = curA == null ? 0 : curA.val;
            int num2 = curB == null ? 0 : curB.val;
             
            int sum = num1 + num2 + carry;
            carry = sum / 10;
             
            tailNode.next = new ListNode(sum % 10);
            tailNode = tailNode.next;
             
            if (curA != null) curA = curA.next;
            if (curB != null) curB = curB.next;
        }
        tailNode.next = null;
         
        return dummyNode.next;
    }
}