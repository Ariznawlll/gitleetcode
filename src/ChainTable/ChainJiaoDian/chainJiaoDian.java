package ChainTable.ChainJiaoDian;

public class chainJiaoDian {
    public static void main(String[] args) {
        //链表1
        ListNode listNode01 = new ListNode(0);
        ListNode listNode02 = new ListNode(9);
        ListNode listNode03 = new ListNode(1);
        ListNode listNode04 = new ListNode(3);
        ListNode listNode05 = new ListNode(5);
        listNode01.next = listNode02;
        listNode02.next = listNode03;
        listNode03.next = listNode04;
        listNode04.next = listNode05;
        //链表2
        ListNode listNode21 = new ListNode(3);
        ListNode listNode22 = new ListNode(2);
        ListNode listNode23 = new ListNode(4);
        listNode21.next = listNode22;
        listNode22.next = listNode23;

        Solution solution = new Solution();
        ListNode node = solution.jiaodian(listNode01, listNode21);
        System.out.println(node);
    }
}

class Solution {
    public ListNode jiaodian(ListNode headA, ListNode headB) {

        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            // A指针与B一路往下走,走完了就去另一个链表的头结点,直至相遇
            // 这里注意不能用pA.next作为判断,因为遇到空链表会发生空指针异常
            // 这里就算有其中一个链表为空或者没相交的也成立(最后为null)
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        // pA==pB
        return pA;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}