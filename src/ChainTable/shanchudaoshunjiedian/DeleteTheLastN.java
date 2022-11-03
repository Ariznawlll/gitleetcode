package ChainTable.shanchudaoshunjiedian;

public class DeleteTheLastN {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution solution = new Solution();
        int index = 2;
        ListNode node = solution.delete(listNode1, index);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}

class Solution {
    public ListNode delete(ListNode head, int index) {
        if (head == null || index <= 0) {
            return null;
        }
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode fast = newNode, slow = newNode;
        int count = 0;
        //提前走了index步
        while (count != (index + 1)) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            count++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return newNode.next;
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
