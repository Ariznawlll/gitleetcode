package ChainTable.detectCycle;

//import ChainTable.ChainJiaoDian.ListNode;

public class detectCycle {
    public static void main(String[] args) {
        ListNode listNode01 = new ListNode(3);
        ListNode listNode02 = new ListNode(2);
        ListNode listNode03 = new ListNode(0);
        ListNode listNode04 = new ListNode(-4);
        listNode01.next = listNode02;
        listNode02.next = listNode03;
        listNode03.next = listNode04;
        listNode04.next = listNode02;
        Solution solution = new Solution();
        ListNode res = solution.detect(listNode01);
        System.out.println(res.val);
    }
}

class Solution {
    public ListNode detect(ListNode head) {
        //假设入口为A，环的入口为B，A->b为x，相遇点为C，B->C为y设定快慢指针，如果能相遇，
        //那么相遇时快指针(2(x + y))走的是慢指针的2倍(x+y)
        //快指针走的路程是A->B->C->B->C
        //画图可以得出想遇到到环的入口的距离等于链表头到链表入口的距离
        ListNode temp = head;
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || slow == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {  //找到了相交点
                break;
            }
        }
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return temp;

    }
}

class ListNode{
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
