package lc203;

//移除链表元素
public class DeleteData {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        int deleteNum = 1;
        Solution solution = new Solution();
        ListNode delete = solution.delete(listNode,deleteNum);
        while (delete != null) {
            System.out.println(delete.value);
            delete = delete.next;
        }
    }
}

class Solution{
    public ListNode delete(ListNode head, int deletenum) {
        //创建虚拟头结点
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        ListNode curr = headNode;

        while (curr.next != null) {
            if (curr.next.value == deletenum) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return headNode.next;
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode(int value) {
        this.value = value;
    }
}
