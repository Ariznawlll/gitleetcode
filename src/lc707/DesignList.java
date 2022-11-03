package lc707;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.util.List;

//get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
//addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
//addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
//addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
//deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
public class DesignList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        Solution solution = new Solution();
        //得到索引处的值
        int a = 2;
        int i = solution.get(a, listNode);
        System.out.println(i);
        //在头部插入一个元素
        ListNode res = solution.addAtHead(10, listNode);
        while (res != null) {
            System.out.print(res.value + " ");
            res = res.next;
        }
        System.out.println();
        ListNode resTail = solution.addAtTail(20, listNode);
        while (resTail != null) {
            System.out.print(resTail.value + " ");
            resTail = resTail.next;
        }
        System.out.println();
        int index = 2;
        int val = 111;
        ListNode AtIndex = solution.addAtIndex(index, val, listNode);
        while (AtIndex != null) {
            System.out.print(AtIndex.value + "  ");
            AtIndex = AtIndex.next;
        }
        System.out.println();
        ListNode listNode4 = solution.deleteAtIndex(index, listNode);
        while (listNode4 != null) {
            System.out.print(listNode4.value + "  ");
            listNode4 = listNode4.next;
        }
    }
}

class Solution {

    public int get(int index, ListNode head) {
        while (index < 0) {
            return -1;
        }
        int a = 0;
        while (a <= index) {
            if (a != index) {
                head = head.next;
                a++;
            } else {
                return head.value;
            }
        }
        return -1;
    }

    public ListNode addAtHead(int val, ListNode head) {
        ListNode listNode = new ListNode(-1);
        listNode.next = head;
        ListNode listNode1 = new ListNode(val);
        listNode1.next = head;
        listNode.next = listNode1;
        return listNode.next;
    }

    public ListNode addAtTail(int val, ListNode head) {
        ListNode node = head;
        while (head.next != null) {
            head = head.next;     //找到尾部元素
        }
        ListNode listNode = new ListNode(val);
        head.next = listNode;
        return node;
    }

    public ListNode addAtIndex(int index, int val, ListNode head) {
        if (index < 0) {
            return null;
        }
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        int a = 0;
        ListNode temp = head;
        while (a <= index) {
            if (a == index) {
                ListNode listNode1 = new ListNode(val);
                listNode.next = listNode1;
                listNode1.next = head;
                return listNode.next;
            } else {
                temp = temp.next;
                a++;
            }
        }
        return temp;
    }

    public ListNode deleteAtIndex(int index, ListNode head) {
        if (index < 0) {
            return null;
        }

        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        listNode.next = head;
        int a = 0;
        while (a <= index) {
            if (a == index) {
                temp.next = head.next;
                return listNode.next;
            } else {
                head = head.next;
                temp = temp.next;
                a++;
            }
        }
        return null;
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode(int value) {
        this.value = value;
    }
}

