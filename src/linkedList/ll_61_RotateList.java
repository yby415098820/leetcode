package linkedList;

import tutorials.ListNode;

public class ll_61_RotateList {
    public static void main(String[] args) {
        //TreeNode
        ListNode node;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        //count the length todo bug2
        ListNode l = head;
        int length = 0;
        while (l != null) {
            l = l.next;
            length++;
        }
        k %= length;

        //get the index1, index2
        ListNode index1 = head, index2 = head;
        int indexNum = 0;
        while (index1.next != null) { //todo bug1
            if (indexNum == k) index2 = index2.next;
            else indexNum++;
            index1 = index1.next;
        }

        // combine as the circle and break
        index1.next = head;
        ListNode res = index2.next; // todo even case k == 0 it is ok, cause already circle res points to the head
        index2.next = null;
        return res;
    }


}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion


 TODO case
 {1,2,3} k = 3
 care k %= 3,

 {1,2,3} k = 0
 should combine the link first


 {}
 {1}
 if null || .next == null  return

 TODO bug
 bug1
 while (index1 != null) { //todo bug1
 =>
 while (index1.next != null) { //todo bug1
 case [1,2,3] 1
 head1:3 head2:2 head2要落后head1 k step,这样才能保证head2.next 是新的头,

 bug2
 //
 =>

 //count the length todo bug2
 ListNode l = head;
 int length = 0;
 while (l != null) {
 l = l.next;
 length++;
 }
 k %= length;
 case k >= length

 bug3
 ListNode res = index2.next; //todo bug3
 res.next = head;
 index2.next = null;
 return res;

 =>
 // combine as the circle and break
 index1.next = head;
 ListNode res = index2.next; // todo even case k == 0 it is ok, cause already circle res points to the head
 index2.next = null;
 return res;


 */

/*
TODO tutorial


TODO follow


 */
