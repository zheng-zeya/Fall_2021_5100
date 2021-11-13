package edu.northeastern.zeyao;

public class Main {

    public static void main(String[] args) {
        LinkedListSynchronized list = new LinkedListSynchronized();

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        list.head = head;
        head.next = node2;
        node2.next = node3;
        node3.next = node4;


        Implement implement = new Implement(list);

        Thread thead1 = new Thread(implement);
        Thread thead2 = new Thread(implement);
        Thread thead3 = new Thread(implement);
        thead1.start();
        thead2.start();
        thead3.start();
    }
}
