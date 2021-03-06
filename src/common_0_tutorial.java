import java.util.*;

public class common_0_tutorial {
    public static void main(String[] args) {
        //todo arrayList
        List<Integer> list = new ArrayList<>();
        list.add(1); // 1
        list.add(3); // 1,3
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i)); // 1,3
        System.out.println("####");

        list.add(0,2); // 2, 1, 3
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        System.out.println("####");

        list.remove(0); // 1,3
        list.add(3);
        list.remove((Object) 3); // 1 (remove 1 elements)
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        System.out.println("####");

        //todo queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);queue.add(2);
        queue.peek(); // 1 队列 先进先出

        //todo deque 双向队列 (double end queue)
        Deque<Integer> deque = new ArrayDeque<>();
        deque.peekLast();deque.peekFirst();
        deque.pollLast();deque.pollFirst();


        //todo linkedList 可以当链表使用 也可以当双向队列 也可以当堆栈
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.pollFirst();
        linkedList.pollLast(); linkedList.peekLast(); //...

        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);ls.add(2);ls.add(3); //   add == addLast =》 (1->2->3) ,  remove == removeLast
        System.out.println(ls.removeFirst());
        System.out.println(ls.removeLast());
        System.out.println(ls);
    }

    /*
    ##########定义private class
     */

    private class A {
        int id;
        public A(int id) {

        }
    }




}
/** 题
 *



TODO tutorial

 todo arrayList


 {1,2,3}
 add
 list.add(4) =>{1,2,3,4}  O(n)
 otherwise : list.add(0,4) =>{4,1,2,3}

 remove
 list.remove((Integer) 3); 删除对象 O(n)

                insert     read     delete
 ArrayList        n          1        n
 LinkedList       1          n        1


 */
